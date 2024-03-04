package edu.neu.csye7374;

public class OrderShippingState implements OrderState {

//	OrderShippingState()
//	{
//		System.out.println("This order has been shipped");
//	}
	@Override
	public void changeOrderStatus() {
		// TODO Auto-generated method stub
		System.out.println("State change of order to Shipped \n\n");
	}

	@Override
	public void getStatus() {
		System.out.println("The Status of the Order is shipped");
		
	}

}
