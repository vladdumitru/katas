package com.vlad.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/*
An anagram is a word formed by rearranging the letters of another given word, for example, “car” and “arc”.

To begin, we first check whether both the Strings are of equal length or not.

Then we convert them to char[] array, sort them, and then check for equality.
 */
public class Anagram {


    private boolean isAnagram(String in, String anagram) {
        char[] charsIn = in.toCharArray();
        char[] anagramIn = anagram.toCharArray();

        Arrays.sort(charsIn);
        String sortedIn = new String(charsIn);
        Arrays.sort(anagramIn);
        String sortedAnagram = new String(anagramIn);

        return sortedIn.equals(sortedAnagram);
    }

    @Test
    public void givenString_whenSortJava8_thenSorted() {
        String sorted = "bdca".chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        assertTrue(sorted.equals("abcd"));
    }

    @Test
    public void testOne() {
        String in = "child";
        String anagram = "lcidh";

        assertTrue(isAnagram(in, anagram));
    }

}
