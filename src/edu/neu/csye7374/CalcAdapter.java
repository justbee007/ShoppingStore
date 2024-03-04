package edu.neu.csye7374;

import java.util.List;

import Product.ProductAPI;

public class CalcAdapter implements CumlativeAPI {
	private final CalculatorAPI calculator;
	public CalcAdapter(CalculatorAPI calculator)
	{   super();
		this.calculator = calculator;
	}
	
	@Override
	public double sum(List<ProductAPI> products) {
		double sum=0;
		
		for(ProductAPI product:products)
		{
			sum = sum+product.getCost();
		}
		return sum;
	}

}
