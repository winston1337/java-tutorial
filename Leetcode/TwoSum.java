package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers we've seen and their indices
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement (the number we need to find)
            int complement = target - nums[i];
            
            // If we've seen the complement before, we found our answer
            if (numToIndex.containsKey(complement)) {
                // Return the indices, with the smaller one first
                int j = numToIndex.get(complement);
                return new int[] {Math.min(i, j), Math.max(i, j)};
            }
            
            // Otherwise, store the current number and its index
            numToIndex.put(nums[i], i);
        }
        
        // This won't be reached since we're guaranteed a solution
        return new int[] {-1, -1};
    }
}