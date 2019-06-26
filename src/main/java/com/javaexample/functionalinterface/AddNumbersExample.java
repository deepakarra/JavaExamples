package com.javaexample.functionalinterface;

public class AddNumbersExample implements AddNumbers {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		AddNumbers addNumbers = (int x,int y)->x+y;
		System.out.println(addNumbers.add(3, 2));
	}
}
