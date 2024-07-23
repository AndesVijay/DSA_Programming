package org.example.easy;

import java.util.Arrays;

public class BinarySearch {
    public boolean implementBinarySearch(int []arr,int target){
        Arrays.sort(arr);
         int len =arr.length;
         int start = 0;
         int end = arr.length-1;
        if (arr.length==0) {
            return false;
        }
         while(start<=end) {
             int mid = (start+end)/2;
             if (target == arr[mid]) {
                 return true;
             } else if (target<arr[mid]) {
                 end = mid-1 ;
             }
             else {
                 start = mid+1;
             }

         }
         return false;
    }
}
