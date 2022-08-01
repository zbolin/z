package com.z.algos;

import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment)) {
                return new int[] {map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}