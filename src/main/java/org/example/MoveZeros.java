package org.example;

import java.util.Arrays;

public class MoveZeros {
    public static void main (String[] args){
        int[] array = {1,0,3,2,0,1,0};
        int[] result= myzeroes(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] myzeroes(int[] nums){
        int pos=0;

        for(int i=0;i<= nums.length -1;i++){
            if(nums[i]!= 0){
                nums[pos++] = nums[i];
            }}
            while(pos<nums.length)  {
                nums[pos++]=0;
            }
         return nums;
    }
}

