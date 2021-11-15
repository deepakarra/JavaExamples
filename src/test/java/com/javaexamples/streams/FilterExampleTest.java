package com.javaexamples.streams;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FilterExampleTest {
private FilterExample filterExample = new FilterExample();

@Test
public void successfulReturnofArrayElementsBasedonSize() {
List<List<Integer>> intArrayList = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4,5));
Assert.assertEquals(1,filterExample.getArrayListElements(intArrayList).size());
Assert.assertEquals(Arrays.asList(Arrays.asList(3,4,5)),filterExample.getArrayListElements(intArrayList));
}
}
