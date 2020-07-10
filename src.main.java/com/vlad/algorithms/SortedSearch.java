package com.vlad.algorithms;

import java.util.Arrays;

/*
Implement function countNumbers that accepts a sorted array of integers and counts the number of array elements that are less than the parameter lessThan.

For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because there are two array elements less than 4.
 */

public class SortedSearch {

    static int sortedSearch(int []ar, final int seek){
        int ind = Arrays.binarySearch(ar, seek);
        System.out.println("ind="+ ind);
        return ind >=0 ? ind :  Math.abs(ind) - 1;
    }


    public static void main(String[] args) {
        System.out.println("num of less=" +  sortedSearch(new int[] { 1, 3, 5, 7 }, 5) );
        System.out.println("num of less=" +  sortedSearch(new int[] { 1, 3, 5, 7 }, 4) );
        System.out.println("num of less=" +  sortedSearch(new int[] { 1, 3, 5, 7 }, 7) );
        System.out.println("num of less=" +  sortedSearch(new int[] { 1, 3, 5, 7 }, 1) );
        System.out.println("num of less=" +  sortedSearch(new int[] { 1, 3, 5, 7 }, 0) );
        System.out.println("num of less=" +  sortedSearch(new int[] { 1, 3, 5, 7 }, 8) );
        System.out.println("num of less=" +  sortedSearch(new int[] { 1, 3, 5, 7 }, 2) );
    }
}
