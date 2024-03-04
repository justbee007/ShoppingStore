package edu.neu.csye7374;

import Product.ElctronicsFactory;
import Product.ProduceFactory;
import Product.ProductAPI;
import Product.SportsFactory;

public class ProductFactorySingleton {
    private static ProductFactorySingleton instance;
    static ElctronicsFactory electronicsFactory = new ElctronicsFactory();
	static SportsFactory sportsfactory = new SportsFactory(); // Abstract Factory
	static ProduceFactory producefactory = new ProduceFactory();

    private ProductFactorySingleton() {
    	
    }

    public static ProductFactorySingleton getInstance() {
        if (instance == null) {
            synchronized (ProductFactorySingleton.class) {
                if (instance == null) {
                    instance = new ProductFactorySingleton();
                }
            }
        }
        return instance;
    }

    public ProductAPI createElectronicsProduct(double cost, String productName) {
        return  electronicsFactory.createProduct(cost, "Electronics", productName);
    }

    public ProductAPI createSportsProduct(double cost, String productName) {
    	return sportsfactory.createProduct(cost, productName, productName);

    }

    public ProductAPI createProduceProduct(double cost, String productName) {
    	return producefactory.createProduct(cost, "Produce", productName);

    }
}
