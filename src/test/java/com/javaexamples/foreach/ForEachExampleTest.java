package com.Jjavaexamples.foreach;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.javaexamples.foreach.ForEachExample;



public class ForEachExampleTest {

	@Test
	public void testGetSquareNumber() {
		List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4 });
		List<Integer> squareList= Arrays.asList(new Integer[] { 1, 4, 9, 16});
		Assert.assertEquals(squareList,(new ForEachExample().getSquareNumber(list)));
	}
}
