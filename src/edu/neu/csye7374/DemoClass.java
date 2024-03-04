package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

import Product.AmountDecorator;
import Product.ElctronicsFactory;
import Product.PercentDecorator;
import Product.ProduceFactory;
import Product.Product;
import Product.ProductBuilder;
import Product.SportsFactory;
import Product.ProductAPI;
import Product.ProductDecorator;

public class DemoClass {
	public static List<ProductAPI> productList = new ArrayList<>();
	public static void productCreation()
	{
		
		ElctronicsFactory electronicsFactory = new ElctronicsFactory();
		SportsFactory sportsfactory = new SportsFactory(); // Abstract Factory
		ProduceFactory producefactory = new ProduceFactory();
		
     
        productList.add(sportsfactory.createProduct(20.5,"sports","Football"));
     
        productList.add(producefactory.createProduct(60,"produce","Chicken Fillets"));
     
        productList.add(electronicsFactory.createProduct(1200.0, "Electronics", "Gaming Laptop"));
     
        productList.add(electronicsFactory.createProduct(80.0, "Electronics", "Wireless Speaker"));
      
        productList.add(electronicsFactory.createProduct(500.0, "Electronics", "iPhone 13"));
      
        productList.add(electronicsFactory.createProduct(80.0, "Electronics", "Wireless Headphones"));
      
        productList.add(sportsfactory.createProduct(25.0, "Sports", "Basketball"));
      
        productList.add(sportsfactory.createProduct(50.0, "Sports", "Tennis Racket"));
      
        productList.add(producefactory.createProduct(5.0, "Produce", "Fresh Apples"));
      
        productList.add(producefactory.createProduct(3.0, "Produce", "Carrots"));
        printProducts();
    }
	
	public static void printProducts() {
		for(ProductAPI product: productList) {
			System.out.println(product);
		}
	}
	
	public static void DiscountDemo() {
		
		for(int i=0; i<productList.size(); i++) {
			switch(productList.get(i).getProductName()) {
			 case "Football":
			     ProductDecorator laptopWithPercentageDiscount =   new PercentDecorator(productList.get(i),5.2);
				 ProductAPI p1 = laptopWithPercentageDiscount.getDiscountedProduct();
				 productList.set(i, p1);
				 break;
			 case "Chicken Fillets":
			     ProductDecorator discountedBasketball = new PercentDecorator(productList.get(i), 10.0);
			     ProductAPI p2 = discountedBasketball.getDiscountedProduct();
			     productList.set(i, p2);
				 break;
			 case "Gaming Laptop":
				 ProductDecorator gaming = new PercentDecorator(productList.get(i), 10.0);
			     ProductAPI p5 = gaming.getDiscountedProduct();
			     productList.set(i, p5);
				 break;
			 case "Wireless Speaker":
				 ProductDecorator discountedWirelessSpeaker = new PercentDecorator(productList.get(i), 10.0);
				 ProductAPI p4 = discountedWirelessSpeaker.getDiscountedProduct(); // Decorator Design Pattern
				 productList.set(i, p4);
				 break;
			 case "iPhone 13":
				 ProductDecorator iphone = new PercentDecorator(productList.get(i), 10.0);
			     ProductAPI p6 = iphone.getDiscountedProduct();
			     productList.set(i, p6);
				 break;
			 case "Wireless Headphones":
				 ProductDecorator wh = new PercentDecorator(productList.get(i), 10.0);
			     ProductAPI p7 = wh.getDiscountedProduct();
			     productList.set(i, p7);
				 break;
			 case "Basketball":
				 ProductDecorator bb = new PercentDecorator(productList.get(i), 10.0);
			     ProductAPI p8 = bb.getDiscountedProduct();
			     productList.set(i, p8);
				 break;
			 case "Tennis Racket":
				 ProductDecorator tr = new PercentDecorator(productList.get(i), 10.0);
			     ProductAPI p9 = tr.getDiscountedProduct();
			     productList.set(i, p9);
				 break;
			 case "Fresh Apples":
			    AmountDecorator discountedApples = new AmountDecorator(productList.get(i), 1.0);
			    ProductAPI p3 = discountedApples.getDiscountedProduct();
			    productList.set(i, p3);
				 break;
			 case "Carrots":
				 ProductDecorator cr = new PercentDecorator(productList.get(i), 10.0);
			     ProductAPI p10 = cr.getDiscountedProduct();
			     productList.set(i, p10);
				 break;
			}
		}
		System.out.println("----------After Discount-------------------");
		printProducts();
	}
	
	
	
	public static void demoOrderManagement() {
		 OrderBuilder orderbuilder1 = OrderBuilder.create(); // OrderBuilder
	        orderbuilder1.addProduct(DemoClass.getProduct("Basketball"));
	        orderbuilder1.addProduct(DemoClass.getProduct("Football"));
	        Address address = new AddressBuilder().setStreet("14 Hemenway Street").setState("MA").setCity("Boston").setZipcode(02115).build();
	        Customer customer = new CustomerBuilder().setName("Abhinav Manoj Menon").setEmailAddress("menon.abh@northeastern.edu").setPhoneNo(8756362772L).setAddress(address).build();
	        orderbuilder1.setCustomer(customer);
	        System.out.println("-------Order-1-----");
	        printOrders(orderbuilder1);
	        EagerSingletonOrderFacade facade = EagerSingletonOrderFacade.getInstance(); // EagerSingleton
	        OrderCommand ordercommand = facade.placeOrder(orderbuilder1); // Command Design Pattern
	        facade.changeOrderToShippingState(ordercommand); // Facade Design Pattern
	        facade.changeOrderToDeliveryState(ordercommand);
	        
	        
	        OrderBuilder orderBuilder2 = OrderBuilder.create();
	        orderBuilder2.addProduct(DemoClass.getProduct("Fresh Apples"));
	        orderBuilder2.addProduct(DemoClass.getProduct("Carrots"));
	        orderBuilder2.addProduct(DemoClass.getProduct("Tennis Racket"));
	        orderBuilder2.addProduct(DemoClass.getProduct("Wireless Headphones"));
	        Address address2 = new AddressBuilder().setState("MA").setCity("Boston").setStreet("13 Garcia Street").setZipcode(2119).build();
	        Customer customer2 = new CustomerBuilder().setName("Daniel Peters").setAddress(address2).setEmailAddress("abhinav1manoj@gmail.com").setPhoneNo(71838483338L).build();
	        orderBuilder2.setCustomer(customer2);
	        System.out.println("-------Order-2-----");
	        printOrders(orderBuilder2);
	        OrderCommand ordercommand2 = facade.placeOrder(orderBuilder2);  // Command Design Pattern
	        facade.changeOrderToShippingState(ordercommand); // Facade Design Pattern
	        facade.changeOrderToDeliveryState(ordercommand);
	        
	        
	}
	public static void printOrders(OrderBuilder orderDetails) {
		List<ProductAPI> prList = orderDetails.getProducts();
		Customer cr = orderDetails.getCustomer();
		System.out.println(cr);
		for(ProductAPI product: prList) {
			System.out.println(product);
		}
	}
	
	public static ProductAPI getProduct(String productName) {
		ProductAPI pr = null;
		for(ProductAPI product: productList) {
			if(product.getProductName().equalsIgnoreCase(productName)) {
				pr = product;
				break;
			}
		}
		return pr;
	}
	
	
}
