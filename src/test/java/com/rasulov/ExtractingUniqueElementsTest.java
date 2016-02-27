package com.rasulov;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExtractingUniqueElementsTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    public ExtractingUniqueElements extractingUniqueElements = new ExtractingUniqueElements();

    int[] array;
    List<Integer> expected;

    @Test
    public void testExtractingUniqueElementsTest() {
        array = new int[]{1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9, 9};
        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(9);
        assertEquals(expected, extractingUniqueElements.extractingUniqueElements(array));

    }

    @Test
    public void testCheckWithException() {
        array = null;
        expectedException.expect(NullPointerException.class);
        extractingUniqueElements.extractingUniqueElements(array);
    }

    @Test
    public void testArrayOfZero(){
        array = new int []{0, 0, 0, 0, 0, 0};
        expected = new ArrayList<Integer>();
        expected.add(0);
        extractingUniqueElements.extractingUniqueElements(array);
    }
}