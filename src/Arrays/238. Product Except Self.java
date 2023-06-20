/*

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 */

package Arrays;

import java.util.Arrays;

class ProdExceptSelf {

    public static int[] productExceptSelfM1(int[] nums) {
        int[] res = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int prod = 1;
            for(int j=0;j<nums.length;j++){
                if(i == j)
                    continue;
                else prod = prod*nums[j];
            }
            res[i] = prod;
        }
        return res;
    }

    public static int[] productExceptSelfM2(int[] nums) {
        int[] res = new int[nums.length];

        int prod = 1;
        for(int num : nums){
            prod = prod * num;
        }

        int i = 0;
        try {
            for(int num: nums){
                res[i++] = prod/num;
            }
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by 0");
        }

        return res;
    }

    public static int[] productExceptSelfM3(int[] nums) {
        int[] res = new int[nums.length];

        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;

        for(int i=1;i< nums.length;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        for(int i= nums.length-2;i >= 0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i=0;i< nums.length;i++){
            res[i] = prefix[i] * suffix[i];
        }

        return res;
    }

    public static int[] productExceptSelfM4(int[] nums) {
        int i, temp = 1;

        int[] prod = new int[nums.length];
        for(i = 0;i<nums.length;i++){
            prod[i] = 1;
        }

        for(i=0;i<nums.length;i++){
            prod[i] = temp;
            temp *= nums[i];
        }

        temp = 1;

        for(i=nums.length-1;i>=0;i--){
            prod[i] *= temp;
            temp *= nums[i];
        }

        return prod;
    }

    public static void main(String[] args){
        int[] input1 = new int[]{1,2,3,4};
        int[] input2 = new int[]{-1,1,0,-3,3};
        int[] res1 = new int[]{24,12,8,6};
        int[] res2 = new int[]{0,0,9,0,0};

        System.out.println("Results from M1");
        System.out.println(Arrays.toString(productExceptSelfM1(input1)));
        System.out.println(Arrays.toString(productExceptSelfM1(input2)));

        System.out.println("\nResults from M3");
        System.out.println(Arrays.toString(productExceptSelfM3(input1)));
        System.out.println(Arrays.toString(productExceptSelfM3(input2)));

        System.out.println("\nResults from M4");
        System.out.println(Arrays.toString(productExceptSelfM4(input1)));
        System.out.println(Arrays.toString(productExceptSelfM4(input2)));

        System.out.println("\nResults from M2");
        System.out.println(Arrays.toString(productExceptSelfM2(input1)));
        System.out.println(Arrays.toString(productExceptSelfM2(input2)));

    }
}


