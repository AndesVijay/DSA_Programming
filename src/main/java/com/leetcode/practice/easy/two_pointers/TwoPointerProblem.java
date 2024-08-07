package com.leetcode.practice.easy.two_pointers;

import java.util.List;

public class TwoPointerProblem {

    /**
     * /**
     * Check whether the given phrase is palindrome or not
     * @param str string to be checked whether it is a palindrome or not
     * @return boolean
     * @TimeComplexity
     * @SpaceComplexity O(n)
     * @TimeTaken 20minutes
     */
   /* public boolean isPalindrome(String str) {


        StringBuilder newString = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122 || str.charAt(i)>=48&&str.charAt(i)<=57) {
                newString.append(str.charAt(i));
            }
        }
        newString = new StringBuilder(newString.toString().toLowerCase());
        System.out.println(newString);
        return isPalindrome(newString.toString());
    }
*/

    /**
     * Count Pairs Whose Sum is Less than Target
     */
    public int CountPairsWhereSumLessThanTarget(List<Integer> nums, int target) {
        /*
        Input: numbs = [-1,1,2,3,1], target = 2
        Output: 3
        */
        Integer[] arr = nums.toArray(new Integer[0]);
        int i=0, count=0,j=1;
        while (i < arr.length - 1) {
            if (arr[i] + arr[j] < target)
                count++;
            if (j == arr.length - 1) {
                i++;
                j = i + 1;
            } else
                j++;

        }
        return count;
    }
}
