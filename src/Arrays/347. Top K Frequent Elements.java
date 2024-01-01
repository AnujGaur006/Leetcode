package Arrays;

import java.util.*;

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

    public static int[] topKFrequent2(int[] nums, int k) {

        Map<Integer, Integer> countOfOcc = new HashMap<>();

        for(int num : nums){
            if(countOfOcc.containsKey(num)){
                countOfOcc.put(num, countOfOcc.getOrDefault(num,0) + 1);
            }else countOfOcc.put(num,1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap =
                new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : countOfOcc.entrySet()) {
            maxHeap.offer(entry);

            // If the size of the PriorityQueue exceeds 'k', remove the element with the smallest value
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Create an array to store the result
        int[] result = new int[k];

        // Populate the result array with the top 'k' keys from the PriorityQueue
        for (int i = k - 1; i >= 0; i--) {
            result[i] = Objects.requireNonNull(maxHeap.poll()).getKey();
        }

        return result;

    }

    public int[] topKFrequent3(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.merge(i, 1, Integer::sum);//For Getting Frequency

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a)); //Sort by Frequency in descending order

        int[] res = new int[k];
        for (int i = 0; i < k; ++i)
            res[i] = list.get(i);

        return res;

    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,2,2,3};

        topKFrequent2(nums,2);

    }
}
