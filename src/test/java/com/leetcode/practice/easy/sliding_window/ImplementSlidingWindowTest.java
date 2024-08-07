package com.leetcode.practice.easy.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementSlidingWindowTest {

    ImplementSlidingWindow s1 = new ImplementSlidingWindow();
    @Test
    void lengthOfLongestSubstring() {
        assertEquals(5,(s1.LengthOfLongestSubstring("abcdbea")));
        assertEquals(5,(s1.LengthOfLongestSubstring("abcbefg")));
        assertEquals(6,(s1.LengthOfLongestSubstring("abcaefg")));
    }
}