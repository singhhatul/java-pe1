package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern pattTest;

    @Before
    public void setUp() {
        this.pattTest = new Pattern();
    }

    @Test
    public void givenNumberShouldReturnAnArray() {
        //act
        int[] actualResult = this.pattTest.printer(7);
        //assert
        int[] expectedResult = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5,
                6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberShouldReturnAnArrayOfLengthOne() {
        //act
        int[] actualResult = this.pattTest.printer(1);
        //assert
        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test (expected = OutOfMemoryError.class)
    public void givenNumberShouldReturnAnOutOfMemoryError() {
        //act
        int[] actualResult = this.pattTest.printer(100000000);
    }

    @Test
    public void givenNumberShouldReturnAnEmptyArray() {
        //act
        int[] actualResult = this.pattTest.printer(0);
        //assert
        int[] expectedResult = {};
        assertArrayEquals(expectedResult, actualResult);
    }
    @After
    public void tearDown(){
        pattTest = null;
    }


}