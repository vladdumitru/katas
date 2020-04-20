package com.vlad.katas.primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.vlad.katas.primefactors.PrimeFactors.generate;
import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints)
            list.add(i);
        return list;
    }

    @Test
    public void testOne() throws Exception {
        assertEquals(list(), generate(1));
    }

    @Test
    public void testTwo() throws Exception {
        assertEquals(list(2),generate(2));
    }

    @Test
    public void testThree() throws Exception {
        assertEquals(list(3),generate(3));
    }

    @Test
    public void testFour() throws Exception {
        assertEquals(list(2,2),generate(4));
    }

    @Test
    public void testSix() throws Exception {
        assertEquals(list(2,3),generate(6));
    }

    @Test
    public void testEight() throws Exception {
        assertEquals(list(2,2,2),generate(8));
    }

    @Test
    public void testNine() throws Exception {
        assertEquals(list(3,3),generate(9));
    }

}