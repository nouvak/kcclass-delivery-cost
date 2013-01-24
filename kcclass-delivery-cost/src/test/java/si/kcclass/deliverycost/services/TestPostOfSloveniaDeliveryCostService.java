package si.kcclass.deliverycost.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import si.kcclass.deliverycost.domain.Address;
import si.kcclass.deliverycost.domain.Country;
import si.kcclass.deliverycost.domain.DeliveryCostRequest;

public class TestPostOfSloveniaDeliveryCostService {
	
	private Country countryUsa;
	private Country countrySlovenia;
	
	private PostOfSloveniaDeliveryCostService service;

	@Before
	public void setUp() throws Exception {
		service = new PostOfSloveniaDeliveryCostService();
		
		countryUsa = new Country();
		countryUsa.setCode("US");
		countryUsa.setName("United States");
		
		countrySlovenia = new Country();
		countrySlovenia.setCode("SI");
		countrySlovenia.setName("Slovenia");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDeliveryCostEurope() {
		DeliveryCostRequest request;
		Address shipper = new Address();
		shipper.setCountry(countrySlovenia);
		shipper.setPostalCode("6230");
		Address recipient = new Address();
		recipient.setCountry(countrySlovenia);
		recipient.setPostalCode("6225");
		request = new DeliveryCostRequest();
		request.setShipper(shipper);
		request.setRecipient(recipient);
		request.setWeight(10.0);
		
		Double deliveryCost = service.getDeliveryCost(request);
		assertNotNull(deliveryCost);
	}
	
	@Test
	public void testGetDeliveryCostUSA() {
		DeliveryCostRequest request;
		Address shipper = new Address();
		shipper.setCountry(countrySlovenia);
		shipper.setPostalCode("6225");
		Address recipient = new Address();
		recipient.setCountry(countryUsa);
		recipient.setPostalCode("38017");
		request = new DeliveryCostRequest();
		request.setShipper(shipper);
		request.setRecipient(recipient);
		request.setWeight(10.0);

		Double deliveryCost = service.getDeliveryCost(request);
		assertNotNull(deliveryCost);
	}
}
