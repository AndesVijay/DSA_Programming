package com.leetcode.practice.easy.sliding_window;

import java.util.HashMap;

public class ImplementSlidingWindow {
    public int LengthOfLongestSubstring(String str) {
        int windowStart = 0, longestLength = 0, index = 0, windowSize = 0;
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        str=str.trim().toLowerCase();

        int strLen = str.length();

        if (strLen <= 1){
            return 1;
        }
        while (index < strLen){
            char ch = str.charAt(index);
            if(lastSeen.containsKey(ch)){
                if(lastSeen.get(ch)>=windowStart){
                    windowSize = index - windowStart;
                    if(longestLength<windowSize){
                        longestLength = windowSize;
                    }
                    windowStart = lastSeen.get(ch) + 1;
                }
                lastSeen.replace(ch,index);
            }
            else {
                lastSeen.put(ch,index);
            }

            index++;
        }
        windowSize = index - windowStart;
        if(longestLength<windowSize){
            longestLength = windowSize;
        }
        return longestLength;
    }
}
