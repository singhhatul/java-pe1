package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharDeterminationTest {
    CharDetermination characterType;

    @Before
    public void setUp(){
        //arrange
        this.characterType = new CharDetermination();
    }

    @Test
    public void givenCharacterShouldReturnLowerCase() {
        //act
        String actualResult = this.characterType.letterDetermination('z');
        //assert
        assertEquals("Lowercase letter", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnUpperCase() {
        //act
        String actualResult = this.characterType.letterDetermination('G');
        //assert
        assertEquals("Capital letter", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnDigit() {
        //act
        String actualResult = this.characterType.letterDetermination('3');
        //assert
        assertEquals("Digit", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnSpecialSymbol() {
        //act
        String actualResult = this.characterType.letterDetermination('@');
        //assert
        assertEquals("Special symbol", actualResult);
    }
    @After
    public void tearDown(){
        characterType = null;
    }
}
