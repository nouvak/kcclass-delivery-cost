package si.kcclass.deliverycost.services;

import si.kcclass.deliverycost.domain.DeliveryCostRequest;

public interface DeliveryCostService {
	
	public Double getDeliveryCost(DeliveryCostRequest request);
	
}
