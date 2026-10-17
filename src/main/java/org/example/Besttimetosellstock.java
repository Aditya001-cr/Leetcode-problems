package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Besttimetosellstock {

    public  static int bestprofit(int[] nums){
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)
                min=nums[i];
            else
             maxprofit=Math.max(maxprofit,nums[i]-min);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] nums={2,4,5,6,8,9};
        int result  = bestprofit(nums);
        System.out.println("my result :" + result);
    }
}
