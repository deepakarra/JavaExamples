package com.javaexamples.streams;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FindFirstTest {
	private FindFirst findFirst = new FindFirst();
	
	@Test 
	public void successufullyReturnFirstEvenNumber() {
	assertEquals(8,findFirst.getFirstEvenNum(Arrays.asList(3,8,6,11,17,10)));
	}
}

