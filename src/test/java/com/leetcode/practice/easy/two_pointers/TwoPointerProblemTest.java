package com.leetcode.practice.easy.two_pointers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointerProblemTest {

    TwoPointerProblem t1 = new TwoPointerProblem();
    /* @Test
     void isPalindrome() {
         assertFalse(t1.isPalindrome("Hello2"));
         assertTrue(t1.isPalindrome("racer"));
         assertTrue(t1.isPalindrome(""));
         assertTrue(t1.isPalindrome("_wow_"));
         assertTrue(t1.isPalindrome("race  car"));
     }
 */
    @Test
    void countPairsWhereSumLessThanTarget() {
        List<Integer> list = Arrays.asList(-1, 1, 2, 3, 1);
        assertEquals(3,t1.CountPairsWhereSumLessThanTarget(list, 2));
    }

}