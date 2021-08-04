package com.javaexamples.defaultmethod;

/*This class implements two interfaces containing the same default method.
 If the class implements two interfaces containing the same default method, the class must override the default method * */
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
