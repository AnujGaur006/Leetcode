package LinkedListProblems;

public class DuplicateNumber {
    class Solution {
        public int findDuplicate(int[] nums) {
            int slow = 0;
            int fast = 0;

            // find the first intersection pt
            // 1->3->2<->4
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);
            // this gives us the intersection 4.

            // now according to Floyd's algo, distance bw intersection and start of cycle and origin and start of
            // cycle remains same, so we need another pointer starting from zero.
            int slow2 = 0;
            do {
                slow = nums[slow];
                slow2 = nums[slow2];
            } while (slow != slow2);

            // the element where they intersect again gives result.
            return slow2;

        }
    }
}
