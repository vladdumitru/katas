package com.vlad.algorithms;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class CountRepeatedLettersTest {

    @Test
    public void testOne() {
        String in = "abcdbecca";
        Map<Character, Integer> result = CountRepeatedLetters.countRepeatedLetters(in);

        assertEquals(Integer.valueOf(3), result.get('a'));
    }

}