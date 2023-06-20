/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */

package Arrays;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> result = new HashMap<>();
        int i = 0;

        while(i < nums.length){
            if(result.containsKey(target - nums[i])){
                return new int[]{result.get(target-nums[i]),i};
            }else result.put(nums[i],i);
            i++;
        }
        return new int[]{0,0};
    }
}
