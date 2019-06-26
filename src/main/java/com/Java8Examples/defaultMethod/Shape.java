package com.Java8Examples.defaultMethod;

public class Shape implements Square,Rectangle {

	@Override
	public void name() {
		Rectangle.super.name();
	}
	
	
	public static void main(String[] args) {
	new Shape().name();
	new Shape().drawRectangle();
	}


	public void drawRectangle() {
		System.out.println("Drawing Rectangle");
	}


	public void drawSquare() {
		System.out.println("Drawing Square");
		
	}

	
}
