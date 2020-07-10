package com.vlad.algorithms;

import java.util.HashMap;
import java.util.Map;

/*
LeetCode – Two Sum (Java)

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target,
where index1 must be less than index2. Please note that your returned answers (both index1 and index2)
are not zero-based.

For example:

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=0, index2=1
 */

public class TwoSum {
    private static Map<Integer, Integer> numPositions;

    public static int[] findTwoSum(int[] list, int sum) {
        numPositions = new HashMap<>();
        System.out.println("sum: " + sum);
        if (list == null || list.length <= 1)
            return null;

        for (int i = 0; i < list.length; i++) {

            int toRetrieve = sum - list[i];

            if (numPositions.containsKey(toRetrieve)) {
                if (toRetrieve + list[i] == sum)
                    return new int[]{numPositions.get(toRetrieve), i};
            }
            numPositions.put(list[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 3, 9}, 5);
        int[] indices2 = findTwoSum(new int[] { 1, 3, 5, 3, 9}, 6);
        int[] indices3 = findTwoSum(new int[] { 1, 2}, 5);
        if (indices != null) {
            System.out.println("indices: " + indices[0] + " " + indices[1]);
        }
        if (indices2 != null) {
            System.out.println("indices2: " + indices2[0] + " " + indices2[1]);
        }
        if (indices3 != null) {
            System.out.println("indices3: " + indices3[0] + " " + indices3[1]);
        }
    }
}