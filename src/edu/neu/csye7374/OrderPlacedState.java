package edu.neu.csye7374;

public class OrderPlacedState implements OrderState {

	
//	OrderPlacedState()
//	{
//		System.out.println("Order is placed");
//	}
	@Override
	public void changeOrderStatus() {
		
	System.out.println("*******State change of order to placed***** \n\n");	
	}

	@Override
	public void getStatus() {
	System.out.println("The status of the Order is placed");
		
	}

}
