package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by csabau on 5/17/2016.
 */
public class AlternateCaseTest {

    @Test
    public void testAlternatingLowerCaseToUpperCaseWholeWord() {

        assertEquals("hello world", AlternateCase.toAlternativeCase("HELLO WORLD"));

    }
    @Test
    public void testAlternatingUpperCaseToLowerCaseWholeWord() {
        assertEquals("HELLO WORLD", AlternateCase.toAlternativeCase("hello world"));
    }
    @Test
    public void testAlternatingUpperCaseToLowerCaseSentence() {
        assertEquals("HELLO WORLD", AlternateCase.toAlternativeCase("hello world"));
    }
    @Test
    public void testCrazyAlternatingCase() {
        assertEquals("ALTerNAtiNG CaSe", AlternateCase.toAlternativeCase("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", AlternateCase.toAlternativeCase("ALTerNAtiNG CaSe"));
    }

    @Test
    public void testIgnoreNumbersAndSpecialCharactersCase() {

        assertEquals("12345", AlternateCase.toAlternativeCase("12345"));
        assertEquals("1A2B3C4D5E", AlternateCase.toAlternativeCase("1a2b3c4d5e"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", AlternateCase.toAlternativeCase("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", AlternateCase.toAlternativeCase("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}
