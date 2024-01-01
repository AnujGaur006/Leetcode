package BinarySearch;

import java.util.HashMap;
import java.util.Map;

class FindMin {
    public int findMin(int[] nums) {
        int li = 0;
        int hi = nums.length - 1;

        while(li <= hi){
            int mid = li + (hi - li)/2;

            if(nums[mid] < nums[hi]){
                hi = mid;
            }else {
                li = mid + 1;
            }
        }
        return nums[hi];

    }

    public static void main(String[] args){
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("One", 1);
        sampleMap.put("Two", 2);
        sampleMap.put("Three", 3);

        // Iterating using entrySet()
        for (Map.Entry<String, Integer> entry : sampleMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        for (Integer entry : sampleMap.values()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
            System.out.println(entry);
        }
    }
}
