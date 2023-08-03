package com.algo.expert.arrays;

/**
 * @author Admin
 * @created 03/08/2023 - 10:11 PM
 * @project expert
 */

import java.util.List;

/**
 * Given two non-empty arrays or list integer, write a function that determines whether the second list is subsequence of the first one.
 * A subsequence is set of number that aren't necessarily adjacent in the array/list but that are the same order as they appear in array/list.
 * For instance, the number [1,3,4] or [2,4] are subsequence of [1,2,3,4].
 * Note that a single number in arr/list and arr/list itself are both valid subsequence of the array/list.
 */
public class ValidateSubSequence {
    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);

        System.out.println(isSequence(array, sequence));
        System.out.println(isSequence(sequence, array));
    }

    public static boolean isSequence(List<Integer> array,
                                     List<Integer> sequence) {
        var index = 0;
        for (var value : array) {
            if (value.equals(sequence.get(index))) {
                index++;
            }

            if (index == sequence.size()) {
                return true;
            }
        }

        return false;
    }

    /**
     * Test case
     * {
     *   "array": [5, 1, 22, 25, 6, -1, 8, 10],
     *   "sequence": [1, 6, 10]
     * }
     * {
     *   "array": [5, 1, 22, 25, 6, -1, 8, 10],
     *   "sequence": [5, 1, 22, 10]
     * }
     * {
     *   "array": [5, 1, 22, 25, 6, -1, 8, 10],
     *   "sequence": [5, -1, 8, 10]
     * }
     * {
     *   "array": [1, 1, 1, 1, 1],
     *   "sequence": [1, 1, 1]
     * }
     * {
     *   "array": [5, 1, 22, 25, 6, -1, 8, 10],
     *   "sequence": [5, 1, 22, 25, 6, -1, 8, 10, 12]
     * }
     * {
     *   "array": [5, 1, 22, 25, 6, -1, 8, 10],
     *   "sequence": [5, 1, 22, 23, 6, -1, 8, 10]
     * }
     * {
     *   "array": [5, 1, 22, 25, 6, -1, 8, 10],
     *   "sequence": [5, 1, 22, 22, 6, -1, 8, 10]
     * }
     * {
     *   "array": [5, 1, 22, 25, 6, -1, 8, 10],
     *   "sequence": [1, 6, -1, -1]
     * }
     */
}
