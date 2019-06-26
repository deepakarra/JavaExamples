package com.javaexamples.defaultmethod;

public interface Rectangle {
	default void name() {
		 System.out.println("Rectangle");
	 }
	 
	void drawRectangle();
}
