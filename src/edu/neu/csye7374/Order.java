package edu.neu.csye7374;

import java.util.List;
import java.util.UUID;
import Product.ProductAPI;

public class Order {
private String orderId;
private List<ProductAPI> products;
private OrderCommand ordercommand;
private OrderState state;
public String getOrderId() {
	return orderId;
}
public List<ProductAPI> getProducts() {
	return products;
}
public double getOrderTotal() {
	return orderTotal;
}
public Customer getCustomer() {
	return customer;
}
private double orderTotal;
private Customer customer;
CalculatorAPI calculator = new Calculator();
CalcAdapter caclculatoradapter = new CalcAdapter(calculator);
public Order(String orderId,List<ProductAPI> products,Customer customer)
{
	this.orderId = orderId;
	this.products = products;
	this.customer = customer;
	this.ordercommand = new OrderCommand(this);
	this.state = new OrderPlacedState();
}
public void createOrder()
{
//	System.out.println("Order has been successfully placed");
	
	this.orderTotal = caclculatoradapter.sum(products);
	System.out.println("An order has been created with id : "+orderId+ " with total sum of : "+ orderTotal+ " for customer "+ customer.getName()+" to address: "+ customer.getAddress().toString());
	state.changeOrderStatus();
	
}
public void changeOrderStatus(OrderState state)
{
	this.state = state;
}

}
