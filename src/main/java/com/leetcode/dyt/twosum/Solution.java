package com.leetcode.dyt.twosum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(nums[0], 0);
        for(int i=1; i<nums.length; i++) {
            int result = target - nums[i];
            if(map.containsKey(result) && map.get(result) != i) {
                return new int[]{map.get(result), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {2,7,11,15};
        int[] result = solution.twoSum(nums, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.printf(i + " ");
        }
    }
}