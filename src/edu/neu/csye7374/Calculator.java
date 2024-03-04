package edu.neu.csye7374;

public class Calculator implements CalculatorAPI {

	@Override
	public double add(double a ,double b) {
		
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		
		return a-b;
	}

	@Override
	public double percentageCalc(double a, double percentage) {
		
		return (a*percentage)/100;
	}

}
