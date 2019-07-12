package com.stackroute.pe1;

import org.junit.*;
import static org.junit.Assert.*;

public class IntegerSortingTest {
    IntegerSorting sorting;

    @Before
    public void setUp() {
        //arrange
        this.sorting = new IntegerSorting();
    }

    @Test
    public void givenIntegerShouldReturnTrue(){
        //act
        String actualResult = sorting.intSorting(88);
        //assert
        assertEquals("True", actualResult);
    }
    @Test
    public void givenIntegerShouldReturnFalse(){
        //act
        String actualResult = sorting.intSorting(12);
        //assert
        assertEquals("False", actualResult);
    }

    @After
    public void tearDown(){
        sorting = null;
    }
}