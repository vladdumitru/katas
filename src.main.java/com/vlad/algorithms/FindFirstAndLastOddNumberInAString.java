package com.vlad.algorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class FindFirstAndLastOddNumberInAString {

    private List<Integer> findFirstAndLastOddNumber(String input) {
        String inputChanged = input.replaceAll("[^0-9]+", " ");
        List<Integer> numbers = (List<Integer>) Arrays.asList(inputChanged.trim().split(" "))
                .stream()
                .mapToInt(Integer::valueOf)
                .filter(i -> i%2 != 0)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> result = Arrays.asList(numbers.get(0), numbers.get(numbers.size() - 1));
        return result;
    }

    @Test
    public void testOne() {
        String input = "ab23isnot2co123k8b21lm";
        List<Integer> expected = Arrays.asList(23,21);

        assertEquals(expected, findFirstAndLastOddNumber(input));
    }

    @Test
    public void testTwo() {
        String input = "5ab23isnot2co123k8b199vc22lm";
        List<Integer> expected = Arrays.asList(5,199);

        assertEquals(expected, findFirstAndLastOddNumber(input));
    }
}
