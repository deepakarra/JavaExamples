package com.javaexamples.defaultmethod;

/*Interface Rectangle with default method*/
public interface Square {
 default void name() {
	 System.out.println("Square");
 }
 
void drawSquare();
}
