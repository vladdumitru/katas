package com.vlad.algorithms;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

// count repeated letters in a String

public class CountRepeatedLetters {
    public static Map<Character, Integer> countRepeatedLetters(String in) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = in.toCharArray();

        for(Character c:charArray) {
            if(map.containsKey(c)) {
                map.computeIfPresent(c, (key, val) -> val + 1);
            } else {
                map.putIfAbsent(c, 1);
            }
        }
        return map;
    }

    @Test
    public void testOne() {
        String in = "abcdbecca";
        Map<Character, Integer> result = CountRepeatedLetters.countRepeatedLetters(in);
        System.out.println(result);

        assertEquals(Integer.valueOf(2), result.get('a'));
        assertEquals(Integer.valueOf(2), result.get('b'));
        assertEquals(Integer.valueOf(3), result.get('c'));
        assertEquals(Integer.valueOf(1), result.get('d'));
        assertEquals(Integer.valueOf(1), result.get('e'));
    }
}



