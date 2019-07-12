package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;

    @Before
    public void setup() {
        //arrange
        System.out.println("Inside before");
        this.junitDemo = new JunitDemo();
    }

    @After
    public void tearDown() {
        System.out.println("inside after");
        junitDemo = null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void givenTwoStringsShouldReturnConcatedUpperString() {

        //act
        String actualresult = junitDemo.concatAndUpperCase("atul ", "singh");
        //assert
        assertNotNull(actualresult);
        assertEquals("ATUL SINGH", actualresult);
    }

    @Test
    public void givenAStringAndNullShouldReturnErrorMessage() {

        //act
        String actualresult = junitDemo.concatAndUpperCase("atul ", null);
        //assert
        assertNotNull(actualresult);
        assertEquals("null value not allowed", actualresult);

    }

    @Test
    public void givenStringShouldShowReturnReverse() {
        String actualResult = junitDemo.reverseString("atul");
        assertEquals("luta", actualResult);
    }


    @Test
    public void givenNullShouldThrowNullPointerException() {
        String actualResult = junitDemo.reverseString("");
        assertEquals("NullPointerException Caught", actualResult);

    }
}
