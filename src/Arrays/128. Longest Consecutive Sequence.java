package Arrays;

import java.util.HashSet;
import java.util.Set;

class LongestConsSeq {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> numSet = new HashSet<>();

        //remove duplicates as longest seq is same irrespective of duplicates
        for(int num:nums){
            numSet.add(num);
        }

        if(numSet.size() == 1){
            return 1;
        }

        for(int num:nums){
            int max = 1, preVal=num-1, postVal=num+1;
            while(numSet.contains(preVal)){
                max++;
                numSet.remove(preVal--);
            }

            while(numSet.contains(postVal)){
                max++;
                numSet.remove(postVal++);
            }

            res = Math.max(res,max);
        }
        return res;

    }
}
