package com.leetcode.practice.easy.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void isTargetNumberPresent() {
        BinarySearch b1 = new BinarySearch();
        assertTrue(b1.isTargetNumberPresent(new int[]{5, 6, 9}, 5));
        assertFalse(b1.isTargetNumberPresent(new int[]{1, 2, 3, 4, 5, 6}, 50));
        assertTrue(b1.isTargetNumberPresent(new int[]{78, 76, 46, 9}, 9));
        assertTrue(b1.isTargetNumberPresent(new int[]{49, 50, 49}, 49));
        assertFalse(b1.isTargetNumberPresent(new int[]{}, 50));
    }
}