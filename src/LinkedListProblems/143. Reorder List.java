package LinkedListProblems;

    class ReorderList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        static int count = 0;
        public void reorderList(ListNode head) {
            ListNode slow = head;
            ListNode fast = head.next;

            // find middle
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            // reverse second half
            ListNode second = slow.next;
            ListNode prev = null, temp = null;
            slow.next = null;

            while(second != null){
                temp = second.next;
                second.next = prev;
                prev = second;
                second = temp;
            }

            // merge two halfs

            ListNode first = head;
            ListNode temp2 = null, temp1 = null;
            second = prev;

            while(second != null){
                temp1 = first.next;
                temp2 = second.next;
                first.next = second;
                second.next = temp1;
                first = temp1;
                second = temp2;
            }

        }
    }
}
