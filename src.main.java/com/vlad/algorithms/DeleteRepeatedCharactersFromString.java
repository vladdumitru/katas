package com.vlad.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteRepeatedCharactersFromString {

    private static String deleteRepeated(String in) {
        StringBuilder sb = new StringBuilder();
        in.chars().distinct().forEach(c -> sb.append((char) c));

        return sb.toString();

    }


    @Test
    public void testOne() {
        String in = "abcDd2b11ecaafboc";
        String result = DeleteRepeatedCharactersFromString.deleteRepeated(in);
        String expected = "abcDd21efo";

        assertEquals(expected, result);

    }

}


