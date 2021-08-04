package com.javaexamples.defaultmethod;

/*Interface Rectangle with default method*/
public interface Rectangle {
	default void name() {
		 System.out.println("Rectangle");
	 }
	 
	void drawRectangle();
}
