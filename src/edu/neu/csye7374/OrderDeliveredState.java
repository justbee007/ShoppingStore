package edu.neu.csye7374;

public class OrderDeliveredState implements OrderState {

//	OrderDeliveredState()
//	{
//		System.out.println("This order has been delivered");
//	}
	
	@Override
	public void changeOrderStatus() {
		System.out.println("State change of order to Delivered \n\n");

	}

	@Override
	public void getStatus() {
		System.out.println("The Status of the Order is delivered");

	}

}
