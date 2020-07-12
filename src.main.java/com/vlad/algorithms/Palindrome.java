package com.vlad.algorithms;

/*
A palindrome is a word, phrase, number, or other sequences of characters which reads the same backward as forward,
such as “madam” or “racecar”.
 */

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class Palindrome {

    static boolean isPalindrome(String in) {
        StringBuilder sb = new StringBuilder(in);
        String reversed = sb.reverse().toString();

        return in.equals(reversed);
    }

    public boolean isPalindromeUsingIntStream(String text) {
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    @Test
    public void testOne() {
        String input = "racecar";

        assertTrue(isPalindrome(input));
//        assertTrue(isPalindromeUsingIntStream(input));
    }

    @Test
    public void testTwo() {
        String input = "racecard";

        assertFalse(isPalindrome(input));
    }


    public boolean isPalindromeRecursive(String text){
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        return recursivePalindrome(clean,0,clean.length()-1);
    }

    private boolean recursivePalindrome(String text, int forward, int backward) {
        if (forward == backward) {
            return true;
        }
        if ((text.charAt(forward)) != (text.charAt(backward))) {
            return false;
        }
        if (forward < backward + 1) {
            return recursivePalindrome(text, forward + 1, backward - 1);
        }

        return true;
    }
}
