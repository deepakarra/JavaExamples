package com.example.java12;

public class StringTransform {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("before transformation "+ str);
		String transformedStr = str.transform(x->x .toUpperCase()+ " " + str);
		System.out.println("transformed string: "+ transformedStr);
	}

}
