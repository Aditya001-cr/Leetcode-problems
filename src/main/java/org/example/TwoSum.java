package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public  static int[] mytwosum(int[] nums,int target){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment = target- nums[i];
            if (map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};//missed new
            }
            map.put(nums[i],i);
        }
return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums={2,4,5,6,8,9};
        int target=8;
        int[] result  = mytwosum(nums,target);
        System.out.println("my result"+ Arrays.toString(result));
    }

}
