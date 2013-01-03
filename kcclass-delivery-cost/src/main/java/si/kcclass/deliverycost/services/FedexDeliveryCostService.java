package si.kcclass.deliverycost.services;

import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.axis.types.NonNegativeInteger;

import si.kcclass.deliverycost.domain.DeliveryCostRequest;

import com.fedex.rate.stub.Address;
import com.fedex.rate.stub.ClientDetail;
import com.fedex.rate.stub.DropoffType;
import com.fedex.rate.stub.NotificationSeverityType;
import com.fedex.rate.stub.PackageSpecialServicesRequested;
import com.fedex.rate.stub.PackagingType;
import com.fedex.rate.stub.Party;
import com.fedex.rate.stub.Payment;
import com.fedex.rate.stub.PaymentType;
import com.fedex.rate.stub.RatePortType;
import com.fedex.rate.stub.RateReply;
import com.fedex.rate.stub.RateReplyDetail;
import com.fedex.rate.stub.RateRequest;
import com.fedex.rate.stub.RateServiceLocator;
import com.fedex.rate.stub.RatedShipmentDetail;
import com.fedex.rate.stub.RequestedPackageLineItem;
import com.fedex.rate.stub.RequestedShipment;
import com.fedex.rate.stub.ServiceType;
import com.fedex.rate.stub.ShipmentRateDetail;
import com.fedex.rate.stub.VersionId;
import com.fedex.rate.stub.WebAuthenticationCredential;
import com.fedex.rate.stub.WebAuthenticationDetail;
import com.fedex.rate.stub.Weight;
import com.fedex.rate.stub.WeightUnits;

public class FedexDeliveryCostService implements DeliveryCostService {

	@Override
	public Double getDeliveryCost(DeliveryCostRequest request) {
		// Build a RateRequest request object
		boolean getAllRatesFlag = false; // set to true to get the rates for different service types
	    RateRequest fedexWsRequest = new RateRequest();
	    fedexWsRequest.setClientDetail(createClientDetail());
	    fedexWsRequest.setWebAuthenticationDetail(createWebAuthenticationDetail());
	    fedexWsRequest.setReturnTransitAndCommit(true);

        VersionId versionId = new VersionId("crs", 13, 0, 0);
        fedexWsRequest.setVersion(versionId);
        
        RequestedShipment requestedShipment = new RequestedShipment();
        
        requestedShipment.setShipTimestamp(Calendar.getInstance());
        requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);
        if (! getAllRatesFlag) {
        	requestedShipment.setServiceType(getServiceType(request));
        	requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING);
        }
        
        Party shipper = new Party();
	    Address shipperAddress = new Address(); // Origin information
	    shipperAddress.setPostalCode(request.getShipper().getPostalCode());
	    shipperAddress.setCountryCode(request.getShipper().getCountry());
        shipper.setAddress(shipperAddress);
        requestedShipment.setShipper(shipper);

        Party recipient = new Party();
	    Address recipientAddress = new Address(); // Destination information
	    recipientAddress.setPostalCode(request.getRecipient().getPostalCode());
	    recipientAddress.setCountryCode(request.getRecipient().getCountry());
	    recipient.setAddress(recipientAddress);
	    requestedShipment.setRecipient(recipient);

	    Payment shippingChargesPayment = new Payment();
	    shippingChargesPayment.setPaymentType(PaymentType.SENDER);
	    requestedShipment.setShippingChargesPayment(shippingChargesPayment);

	    RequestedPackageLineItem rp = new RequestedPackageLineItem();
	    rp.setGroupPackageCount(new NonNegativeInteger("1"));
	    rp.setWeight(new Weight(WeightUnits.KG, new BigDecimal(request.getWeight())));
	    PackageSpecialServicesRequested pssr = new PackageSpecialServicesRequested();
	    rp.setSpecialServicesRequested(pssr);
	    requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[] {rp});
	    fedexWsRequest.setRequestedShipment(requestedShipment);
		try {
			// Initialize the service
			RateServiceLocator service;
			RatePortType port;
			service = new RateServiceLocator();
			updateEndPoint(service);
			port = service.getRateServicePort();
			// This is the call to the web service passing in a RateRequest and returning a RateReply
			RateReply reply = port.getRates(fedexWsRequest); // Service call
			if (isResponseOk(reply.getHighestSeverity())) {
				return getMinimalDeliveryCost(reply);
			}
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		return null;
	}
	
	private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        String accountNumber = System.getProperty("accountNumber");
        String meterNumber = System.getProperty("meterNumber");
        
        // See if the accountNumber and meterNumber properties are set,
        // if set use those values, otherwise default them to "XXX"
        if (accountNumber == null) {
        	accountNumber = "510087224"; // Replace "XXX" with clients account number
        }
        if (meterNumber == null) {
        	meterNumber = "118574485"; // Replace "XXX" with clients meter number
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
	}
	
	private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential wac = new WebAuthenticationCredential();
        String key = System.getProperty("key");
        String password = System.getProperty("password");
        
        // See if the key and password properties are set,
        // if set use those values, otherwise default them to "XXX"
        if (key == null) {
        	key = "UCRMCXUzM8Rsnrpk";
        }
        if (password == null) {
        	password = "bVaJmWFeBSpnXmFECOw444VDf";
        }
        wac.setKey(key);
        wac.setPassword(password);
		return new WebAuthenticationDetail(wac);
	}
	
	private static void updateEndPoint(RateServiceLocator serviceLocator) {
		String endPoint = System.getProperty("endPoint");
		if (endPoint != null) {
			serviceLocator.setRateServicePortEndpointAddress(endPoint);
		}
	}
	
	private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
			notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
			notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
	}
	
	private Double getMinimalDeliveryCost(RateReply reply) {
		Double minimalDeliveryCost = null;
		RateReplyDetail[] rrds = reply.getRateReplyDetails();
		for (int i = 0; i < rrds.length; i++) {
			RateReplyDetail rrd = rrds[i];
			RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
			for (int j = 0; j < rsds.length; j++) {
				RatedShipmentDetail rsd = rsds[j];
				ShipmentRateDetail srd = rsd.getShipmentRateDetail();
				Double totalNetCharge = srd.getTotalNetCharge().getAmount().doubleValue();
				if (minimalDeliveryCost == null || totalNetCharge < minimalDeliveryCost) {
					minimalDeliveryCost = totalNetCharge;
				}
			}
		}
		return minimalDeliveryCost;
	}
	
	private ServiceType getServiceType(DeliveryCostRequest request) {
		if (request.getShipper().getCountry().equals("US") && 
				request.getRecipient().getCountry().equals("US")) {
			return ServiceType.PRIORITY_OVERNIGHT;
		}
		else {
			return ServiceType.INTERNATIONAL_ECONOMY;
		}
	}
}
