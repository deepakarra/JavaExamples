package com.javaexamples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Filter based on array size
 * 
 */
public class FilterExample {

	public static void main(String[] args) {
		List<List<Integer>> intArrayList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(1),
				Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(new FilterExample().getArrayListElements(intArrayList));
	}

	protected List<List<Integer>> getArrayListElements(List<List<Integer>> intArrayList) {
		return intArrayList.stream().filter(x -> x.size() > 2).collect(Collectors.toList());
	}

}
