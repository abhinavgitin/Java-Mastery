package fundamentals.tests;

import java.util.*;
class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 3,4,5 ,8};
        System.out.println(sol.minSum(arr));
    }
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        // String str1 = "";
        // String str2 = "";
        int sortarr[] = new int[arr.length];
        for ( int i = 0 ; i < arr.length/2 ; i++ ){
            sortarr[i] = arr[i];
        }
        for ( int i = (arr.length/2) ; i < arr.length ; i++ ){
            sortarr[i] = arr[i];
        }
        int arrangearr[] = new int[arr.length];
        String sum1 = "0";
        String sum2 = "0";
        for ( int i = 0; i < arr.length; i++ ){
            if ( i % 2 == 0 ){
                arrangearr[i] = sortarr[i];
            } else {
                arrangearr[i] = sortarr[i];
            }
        }
        for (int i = 0; i < arrangearr.length; i++) {
            if ( i % 2 == 0 ){
                sum1 += String.valueOf(arrangearr[i]);
            } else {
                sum2 += String.valueOf(arrangearr[i]);
            }
        }
        return String.valueOf(Integer.parseInt(sum1) + Integer.parseInt(sum2));
    }
}

