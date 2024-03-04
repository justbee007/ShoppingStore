package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Product.ProductAPI;

public class OrderBuilder {
	private String orderId;
	private List<ProductAPI> products;
	private OrderCommand ordercommand;
	private Customer customer;
	
	private OrderBuilder(String orderId)
	{
		this.orderId = orderId;
		this.products = new ArrayList<>();
	}
	public Order build()
	{
		Order order = new Order(orderId,products,customer);
		
		return order;
	}
 public static OrderBuilder create() {
	        return new OrderBuilder(UUID.randomUUID().toString());
	    }

	    public OrderBuilder addProduct(ProductAPI product) {
	        this.products.add(product);
	        return this;
	    }
	    public OrderBuilder setCustomer(Customer customer)
	    {
	    	this.customer = customer;
	    	return this;
	    }
		public String getOrderId() {
			return orderId;
		}
		public List<ProductAPI> getProducts() {
			return products;
		}
		public OrderCommand getOrdercommand() {
			return ordercommand;
		}
		public Customer getCustomer() {
			return customer;
		}
	    
}
