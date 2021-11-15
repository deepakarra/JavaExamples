package com.javaexamples.streams;

import java.util.Arrays;
import java.util.List;

/*Class to generate  sum of Double of event numbers
 * 
 */
public class SumDoubleOfEvenNumbers {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 11, 24, 14);
		System.out.println(getDoubleSumOfEven(intList));

	}

	
	/**
	 * @param intList is list of integers
	 * @return returns sum of double of even numbers
	 */
	protected static int getDoubleSumOfEven(List<Integer> intList) {
		return intList.stream()
				.filter(a -> a % 2 == 0)
				.mapToInt(a -> a * 2)
				.sum();
	}
}
