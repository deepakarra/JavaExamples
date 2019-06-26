package com.Java8Examples.defaultMethod;

public interface Rectangle {
	default void name() {
		 System.out.println("Rectangle");
	 }
	 
	void drawRectangle();
}
