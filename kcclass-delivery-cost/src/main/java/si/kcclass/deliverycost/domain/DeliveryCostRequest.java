package si.kcclass.deliverycost.domain;

public class DeliveryCostRequest {
	private Address shipper;
	private Address recipient;
	private Double weight;
	
	public Address getShipper() {
		return shipper;
	}
	public void setShipper(Address shipper) {
		this.shipper = shipper;
	}
	public Address getRecipient() {
		return recipient;
	}
	public void setRecipient(Address recipient) {
		this.recipient = recipient;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
