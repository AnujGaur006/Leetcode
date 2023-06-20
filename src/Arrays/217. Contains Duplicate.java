package Arrays;

import java.util.HashSet;
import java.util.Set;

class ContainsDups {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicateCount = new HashSet<>();

        for(int num:nums){
            if(duplicateCount.contains(num)){
                return true;
            }
            duplicateCount.add(num);
        }
        return false;
    }
}
