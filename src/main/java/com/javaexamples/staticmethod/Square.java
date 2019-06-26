package com.javaexamples.staticmethod;

public interface Square {
 default void name() {
	 System.out.println("Square");
 }
 
 static  void color() {
	 System.out.println("White color square");
 }
 
void drawSquare();
}
