package org.example;

import java.util.Arrays;

public class MaxSubarrayKadanesAlgorith {
    public static void main (String[] args){
        int[] nums={-1,2,-4,2,0,3,-1};
        int result= maxSubarray(nums);
        System.out.println(result);
    }

    public static int maxSubarray( int[] nums) {
        int count = 0;
        int maxxsum=0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (count < 0) {
                count = 0;}
                count += nums[i];

            maxxsum = Math.max(maxxsum, count);
        }
        return maxxsum;
    }
}
