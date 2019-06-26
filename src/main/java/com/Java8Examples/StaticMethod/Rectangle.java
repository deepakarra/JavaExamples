package com.Java8Examples.StaticMethod;

public interface Rectangle {
	default void name() {
		 System.out.println("Rectangle");
	 }
	 
	 static  void color() {
		 System.out.println("White color Rectangle");
	 }
	void drawRectangle();
}
