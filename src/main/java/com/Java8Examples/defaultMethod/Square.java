package com.Java8Examples.defaultMethod;

public interface Square {
 default void name() {
	 System.out.println("Square");
 }
 
void drawSquare();
}
