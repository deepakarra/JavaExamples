package com.javaexamples.foreach;

import java.util.*;

/**
 * Example to square every number of an array using ForEach
 *
 */
public class ForEachExample {
	public static void main(String[] argv) throws Exception {
		List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4 });
		new ForEachExample().getSquareNumber(list);
	}

	public List<Integer> getSquareNumber(List<Integer> list) {
		// Java7
		// List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4});
		// for(int i=0;i<list.size();i++) {
		// System.out.println(i*i);
		// }

		// java8
		List<Integer> squareList= new ArrayList<>();
		list.forEach(i -> squareList.add(i * i));
		return squareList;
	}
}