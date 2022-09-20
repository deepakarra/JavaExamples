package com.example.java12;

public class StringIndent {
public static void main(String args[]) {
	String str = "Hello World!";
	int indentation =5;
	applyIndentation(str, indentation);
}

private static void applyIndentation(String str,int Indentation) {
	System.out.println("Before applying indentation:\n"+str);
	System.out.println("After applying indentation: \n" +	str.indent(5));
}
}
