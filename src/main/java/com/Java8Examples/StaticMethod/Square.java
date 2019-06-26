package com.Java8Examples.StaticMethod;

public interface Square {
 default void name() {
	 System.out.println("Square");
 }
 
 static  void color() {
	 System.out.println("White color square");
 }
 
void drawSquare();
}
