package si.kcclass.deliverycost.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import si.kcclass.deliverycost.domain.Address;
import si.kcclass.deliverycost.domain.DeliveryCostRequest;

public class TestUpsDeliveryCost {
	
	private DeliveryCostRequest request;

	@Before
	public void setUp() throws Exception {
		Address shipper = new Address();
		shipper.setCountry("US");
		shipper.setPostalCode("38115");
		Address recipient = new Address();
		recipient.setCountry("SI");
		recipient.setPostalCode("6225");
		request = new DeliveryCostRequest();
		request.setShipper(shipper);
		request.setRecipient(recipient);
		request.setWeight(10.0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDeliveryCost() {
		
		fail("Not yet implemented");
	}

}
