package tipeveryday.execute;

import tipeveryday.service.AbstractCalculator;

public class CalculatorDemo extends AbstractCalculator {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int Subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public int division(int a, int b) {
		return a / b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
	
	public double squareRoot(int a) {
		return Math.sqrt(a);
	}
	
	public double squareRoot(double a) {
		return Math.sqrt(a);
	}
	
	public double exponentiation(double a, double b) {
		return Math.pow(a, b);
	}

}
