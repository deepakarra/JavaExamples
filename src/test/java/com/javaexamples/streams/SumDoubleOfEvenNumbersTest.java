package com.javaexamples.streams;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



public class SumDoubleOfEvenNumbersTest {
	private SumDoubleOfEvenNumbers sumOfEvenNumbers = new SumDoubleOfEvenNumbers();

	@Test
	public void SuccessfulSumOfEvenNumbers() {
		Assert.assertEquals(12,SumDoubleOfEvenNumbers.getDoubleSumOfEven(Arrays.asList(1,2,4,5)));
	}
}
