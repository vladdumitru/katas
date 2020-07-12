package com.vlad.algorithms;

import org.junit.Test;

import java.util.LinkedHashSet;

import static org.junit.Assert.assertEquals;

public class DeleteNonLettersAndRepeatedLettersFromString {


    private static String deleteRepeated(String in) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < in.length(); i++) {
            linkedHashSet.add(in.charAt(i));
        }
        for(Character c : linkedHashSet) {
            if(Character.isLetter(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @Test
    public void testOne() {
        String in = "abcDd2b11ecaafboc";
        String result = DeleteNonLettersAndRepeatedLettersFromString.deleteRepeated(in);
        String expected = "abcDdefo";

        assertEquals(expected, result);

    }
}
