package com.leetcode.practice.easy.easy;

import java.util.Arrays;

public class BinarySearch {

    public boolean isTargetNumberPresent(int[] arr, int target) {
        /**
         * Search the target element in the given array and return true if present else return false
         * @param arr array of integers
         * @param target element to be searched
         * @return boolean
         * @TimeComplexity O(nlogn)
         * @SpaceComplexity O(n)
         * @TimeTaken 30minutes
         *
         * Example
         */
        Arrays.sort(arr);
        int len = arr.length;
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            return false;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return false;
    }
}
