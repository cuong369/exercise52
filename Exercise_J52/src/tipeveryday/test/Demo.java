package tipeveryday.test;

import tipeveryday.execute.CalculatorDemo;

public class Demo {

	public static void main(String[] args) {
		CalculatorDemo demo = new CalculatorDemo();

		System.out.println("The 1st test program to test this calculator for these expressions");
		System.out.println("Addition of 128 and 256 are: " + demo.addition(128, 256));
		System.out.println("Subtraction of 128 and 256 are: " + demo.Subtraction(1012, 837));
		System.out.println("Division of 128 and 256 are: " + demo.division(1990, 25));
		System.out.println("Multiplication of 128 and 256 are: " + demo.multiplication(58, 15));

		System.out.println("===========================");

		System.out.println("The 2nd test program to test this new scientific calculator for the following expressions");
		System.out.println("Multiplication of 15.05 and 26.32 are: " + demo.multiplication(15.05, 26.32));
		System.out.println("Division of 1990 and 25 are: " + demo.division(1990, 25));
		System.out.println("Square root of 100 is: " + demo.squareRoot(100));
		System.out.println("Exponent 3 of 8 is: " + demo.exponentiation(3, 8));
	}
}
