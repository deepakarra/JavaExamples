package com.javaexamples.defaultmethod;

public interface Square {
 default void name() {
	 System.out.println("Square");
 }
 
void drawSquare();
}
