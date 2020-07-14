package com.vlad.algorithms;

import org.junit.Test;

import java.util.stream.LongStream;

import static org.junit.Assert.assertEquals;

public class Factorial {
    public static long factorialRecursive( long n )
    {
        if(n==0) return 1;
        return n == 1 ? 1 : n * factorialRecursive( n-1 );
    }

    public static long factorialStreams( long n )
    {
        return LongStream.rangeClosed( 1, n )
                .reduce(1, ( long a, long b ) -> a * b);
    }

    public static long factorialIterative ( long n )
    {
        long r = 1;
        for ( long i = 1; i <= n; i++ )
        {
            r*=i;
        }
        return r;
    }

    @Test
    public void testOne() {
        assertEquals(1, factorialRecursive(0));
        assertEquals(1, factorialRecursive(1));
        assertEquals(2, factorialRecursive(2));
        assertEquals(6, factorialRecursive(3));
        assertEquals(24, factorialRecursive(4));
    }
}
