package Arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class TopKFreqElems{
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else map.put(num,1);
        }

        int[] counts =  map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return counts;

    }
}
