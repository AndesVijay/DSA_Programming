package com.leetcode.practice.easy.two_pointers;

public class TwoPointerProblem {
    public boolean isPalindrome(String str )
    {
        int left = 0,right = str.length()-1;
        if (str.isEmpty())
            return false;
        while(left<=right){

            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;right--;
    }
        return true;
    }
}
