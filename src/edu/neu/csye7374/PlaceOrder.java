package edu.neu.csye7374;


public interface PlaceOrder {
	void execute();
	void setState(OrderState state);
	void getStatus();
	
}
