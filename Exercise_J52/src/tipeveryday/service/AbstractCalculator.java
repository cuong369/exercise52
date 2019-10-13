package tipeveryday.service;

public abstract class AbstractCalculator implements Calculator {

	public double addition(double a, double b) {
		return a + b;
	}

	public double Subtraction(double a, double b) {
		return a - b;
	}

	public double division(double a, double b) {
		return a / b;
	}

	public double multiplication(double a, double b) {
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
