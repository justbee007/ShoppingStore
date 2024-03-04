package edu.neu.csye7374;

import Product.ProductAPI;

public class EmailObserver implements OrderObserver {

	@Override
	public void sendOnOrderPlaced(Order order) {
		String subject = "Your Order no " + order.getOrderId()+ " has been placed";
		String list ="";
		for(ProductAPI product:order.getProducts())
		{
			list = list + product.getProductName() + " " + product.getCategory() + " " + product.getCost() + " \n\n";
		}
		String body = "Dear "+ order.getCustomer().getName() + "\n\n " + list + " Your order Total is " +order.getOrderTotal()+"\n\n"+"Thank You"+"\n"+"EStore Team";
		String emailaddress = order.getCustomer().getEmailAddress();
		SendEmaillTLS.send(subject,body,emailaddress);
		
	}

	@Override
	public void sendOnOrderShipped(Order order) {
		String subject = "Your Order no " + order.getOrderId()+ " has been shipped";
		String list ="";
		for(ProductAPI product:order.getProducts())
		{
			list = list + product.getProductName() + " " + product.getCategory() + " " + product.getCost() + " \n\n";
		}
		String body = "Dear "+ order.getCustomer().getName() + "\n\n " + list + " Your order Total is " +order.getOrderTotal()+"\n\n"+"Thank You"+"\n"+"EStore Team";	
		String emailaddress = order.getCustomer().getEmailAddress();
		SendEmaillTLS.send(subject,body,emailaddress);
		
	}

	@Override
	public void sendOnOrderDelivery(Order order) {
		String subject = "Your Order no " + order.getOrderId()+ " has been delivered";
		String list ="";
		for(ProductAPI product:order.getProducts())
		{
			list = list + product.getProductName() + " " + product.getCategory() + " " + product.getCost() + " \n\n";
		}
		String body = "Dear "+ order.getCustomer().getName() + "\n\n " + list + " Your order Total is " +order.getOrderTotal()+"\n\n"+"Thank You"+"\n"+"EStore Team";		
		String emailaddress = order.getCustomer().getEmailAddress();
		SendEmaillTLS.send(subject,body,emailaddress);
		
	}

}
