package BinarySearch;

class PeakElement {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int m = l + (r - l)/2;
            if((m - 1 < 0 || nums[m-1]<nums[m]) &&
                    (m == nums.length -1 || nums[m+1]<nums[m])){
                return m;
            }else if(nums[m]<nums[m+1]){
                l = m + 1;
            }else if(nums[m-1]>nums[m]){
                r = m - 1;
            }
        }

        return -1;

    }
}
