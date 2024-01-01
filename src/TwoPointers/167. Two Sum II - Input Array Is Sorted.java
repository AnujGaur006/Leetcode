package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TwoSum {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0, right = numbers.length - 1;

        while(left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left + 1,right + 1};
            }else if(numbers[left] + numbers[right] > target){
                right--;
            }else left++;

        }

        return new int[2];

    }

    public static void main(String[] args){
        List<Integer> lsit = Arrays.asList(1,2,3);
        System.out.println(lsit);
    }
}
