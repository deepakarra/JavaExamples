package com.javaexamples.streams;

import java.util.Arrays;
import java.util.List;

/* Returns the  first even number found in the list  
 * 
 */
public class FindFirst {
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2,25,6,16,8,10,1,3,5);
		System.out.println(new FindFirst().getFirstEvenNum(intList));
		
	}

	public  int getFirstEvenNum(List<Integer> intList) {
		 return intList.stream()
				.filter(a->a%2==0)
				.findFirst().get();
	}

}
