/*

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 */

package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // -4,-1,-1,0,1,2

        // iterate till length - 2 as we already have l and r index element.
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && (nums[i] == nums[i-1])) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;

                    // extra while loops to ignore any duplicates
                    while((l<r) && (nums[l]==nums[l-1])) l++;
                    while((l<r) && (nums[r]==nums[r+1])) r--;
                }
                if(sum < 0){
                    l++;
                }
                else if(sum > 0) {
                    r--;
                }
            }
        }
        return result;
    }
}
