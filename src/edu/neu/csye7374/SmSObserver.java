package edu.neu.csye7374;

public class SmSObserver implements OrderObserver {

	@Override
	public void sendOnOrderPlaced(Order order) {
		System.out.println("SMS - Order has been placed");
		
	}

	@Override
	public void sendOnOrderShipped(Order order) {
		System.out.println("SMS - Order has been shipped");
		
	}

	@Override
	public void sendOnOrderDelivery(Order order) {
		System.out.println("SMS - Order has been delivered");
		
	}

}
