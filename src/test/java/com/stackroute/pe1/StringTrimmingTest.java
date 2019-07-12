package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringTrimmingTest {
        StringTrimming subString;


        @Before
        public void setup() {
            this.subString = new StringTrimming();
        }

        @After
        public void tearDown() {
            subString=null;
        }

        @Test
        public void givenInputAndShouldProperOutput() {
            String actualResult = this.subString.substringConcat("Stackroute", 5);
            assertEquals("Stackrouterouterouterouterouteroute", actualResult);
        }

        @Test
        public void givenInputAndShowProperOutput() {
            String actualResult = this.subString.substringConcat("Stackroute", 5);
            assertEquals("Stackrouterouterouterouterouteroute", actualResult);
        }

        @Test
        public void givenStringLengthShouldBeLarger() {
            String actualResult = subString.substringConcat("Sta", 5);
            assertEquals("string must be larger than the number", actualResult);
        }

        @Test
        public void givenStringLengthShouldBeGreaterThanZero() {
            String actualResult = subString.substringConcat(null, 5);
            assertEquals("string must be non null", actualResult);
        }
    }