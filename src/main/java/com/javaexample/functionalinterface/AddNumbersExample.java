package com.javaexample.functionalinterface;

public class AddNumbersExample implements AddNumbers {

	public static void main(String[] args) {
		System.out.println( new AddNumbersExample().add(3, 2));
	}

	public int add(int a, int b) {
		return a+b;
	}
	
	
}
