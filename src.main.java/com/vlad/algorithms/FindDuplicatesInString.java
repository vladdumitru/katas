package com.vlad.algorithms;

/*
Program to find the duplicate characters in a string
 */

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FindDuplicatesInString {


    private Set<Character> findDuplicatesInString(String input) {
        Set<Character> duplicates = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.toLowerCase().charAt(i);
            if (!duplicates.contains(c)) {
                if (input.substring(i + 1).contains(String.valueOf(c))) {
                    duplicates.add(c);
                }
            }
        }
        return duplicates;
    }

    @Test
    public void testOne() {
        String input ="Anaaremere";

        assertEquals(new HashSet(Arrays.asList('a', 'r', 'e')), findDuplicatesInString(input));
    }

    @Test
    public void testTwo() {
        String input ="abc";

        assertEquals(new HashSet(), findDuplicatesInString(input));
    }

    @Test
    public void testThree() {
        String input ="abbcda";

        assertEquals(new HashSet(Arrays.asList('a', 'b')), findDuplicatesInString(input));
    }
}
