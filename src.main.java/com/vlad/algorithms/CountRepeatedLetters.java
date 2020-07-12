package com.vlad.algorithms;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

// count repeated letters in a String

public class CountRepeatedLetters {
    public static Map<Character, Integer> countRepeatedLetters(String in) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = in.toCharArray();

        for(Character c:charArray) {
            if (!Character.isLetter(c))
                continue;
            if(map.containsKey(c)) {
                map.computeIfPresent(c, (key, val) -> val + 1);
            } else {
                map.putIfAbsent(c, 1);
            }
        }

        map = map.entrySet().stream()
                .filter(mapEntry -> (mapEntry.getValue().compareTo(1) > 0))
                .collect(Collectors.toMap(mapEntry -> mapEntry.getKey(), mapEntry -> mapEntry.getValue()));
        return map;
    }

    @Test
    public void testOne() {
        String in = "abcd3A3becca";
        Map<Character, Integer> result = CountRepeatedLetters.countRepeatedLetters(in);
        System.out.println(result);
        Map<Character, Integer> expected = Stream.of(new Object[][] {
            { 'a', 2},
            { 'b', 2},
            { 'c', 3}
        }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));

        assertEquals(expected, result);
//        assertEquals(Integer.valueOf(2), result.get('a'));
//        assertEquals(Integer.valueOf(2), result.get('b'));
//        assertEquals(Integer.valueOf(3), result.get('c'));
//        assertEquals(Integer.valueOf(1), result.get('d'));
//        assertEquals(Integer.valueOf(1), result.get('e'));
    }
}



