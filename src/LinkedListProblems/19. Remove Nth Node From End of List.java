package LinkedListProblems;

class   RemoveNthNode {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode dummy = new ListNode(0,head);
            ListNode left = dummy;
            ListNode right = head;

            while(n > 0 && right !=null){
                right = right.next;
                n--;
            }

            while(right != null){
                left = left.next;
                right = right.next;
            }

            left.next = left.next.next;
            return dummy.next;

        }

        public ListNode removeNthFromEndSol2(ListNode head, int n) {

            int index = 0;
            ListNode temp = head;
            while(temp != null){
                index++;
                temp = temp.next;
            }

            index -= n;
            int i=0;

            ListNode result = new ListNode();
            ListNode trav = result;

            while(head != null){
                System.out.println(head.val + " " + i  + " " + index);
                if(i == index){
                    trav.next = head.next;
                }else {
                    trav.next = head;
                    trav = trav.next;
                }

                head = head.next; i++ ;
            }

            return result.next;
        }
}
