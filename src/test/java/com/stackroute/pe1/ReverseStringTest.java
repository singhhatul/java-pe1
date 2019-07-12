package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverse;

    @Before
    public void setUp() {
        //arrange
        this.reverse = new ReverseString();
    }

    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String actualResult = reverse.reverseAString("Hello");
        //assert
        assertEquals("olleH", actualResult);
    }
    @After
    public void tearDown(){
        reverse = null;
    }
}