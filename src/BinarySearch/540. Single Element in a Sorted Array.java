package BinarySearch;

class DuplicateISingleElement {
    public int singleNonDuplicate(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int leftSize = 0;

        while(i <= j){
            int mid = i + (j- i)/2;

            if((mid - 1 < 0 || nums[mid-1] != nums[mid]) &&
                    (mid +1 == nums.length || nums  [mid] != nums[mid+1]))
                return nums[mid];

            // System.out.println("i:"+i+" j:"+j+" mid:"+mid+"leftSize"+leftSize);

            if(nums[mid-1] == nums[mid])
                leftSize = mid - 1;
            else leftSize = mid;

            if(leftSize % 2 == 0)
                i = mid + 1;
            else j = mid - 1;
        }

        return -1;

    }
}
