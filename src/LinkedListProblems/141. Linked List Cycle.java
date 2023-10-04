package LinkedListProblems;

import java.util.HashSet;
import java.util.Set;

class HasCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> setOfNodes = new HashSet<>();

        while(head != null){
            if(setOfNodes.contains(head)){
                return true;
            }else setOfNodes.add(head);

            head = head.next;
        }

        return false;
    }

    public boolean hasCycle2(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) return true;
        }

        return false;

    }
}
