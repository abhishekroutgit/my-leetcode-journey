package org.example.leetcode;

/*

1. Two Sum
Solved
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum_leetcode_1 {

    public static void main(String[] args){
        //int[] nums = {2,7,11,15};
        //int target  = 9;

        int[] nums = {3,2,4};
        int target  = 6;

        int[] finaloutput = twoSum(nums, target);

        for (int i : finaloutput) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] numsArray = new int[2];
        for(int i = 0 ; i<nums.length; i++){
            //System.out.println(i);
            for(int j = i+1 ; j <nums.length; j++){
                if(nums[i] + nums[j] == target){
                    numsArray[0] = i;
                    numsArray[1] = j;
                }
            }

        }

        return numsArray;
    }
}
