package LinkedListProblems;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int sum = 0;
        ListNode result = new ListNode();
        ListNode prev = result;

        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;

            if(sum >=10){sum = sum - 10; carry = 1;} else carry = 0;

            prev.next = new ListNode(sum, l1.next);
            prev = prev.next; l1 = l1.next; l2 = l2.next;
        }

        if(l1 != null){
            while(l1 != null){

                sum = l1.val + carry;

                if(sum >=10)
                {sum = sum - 10; carry = 1;} else carry = 0;

                prev.next = new ListNode(sum, l1.next);
                prev = prev.next; l1 = l1.next;
            }
        }

        if(l2 != null){
            while(l2 != null){

                sum = l2.val + carry;

                if(sum >=10){sum = sum - 10; carry = 1;} else carry = 0;

                prev.next = new ListNode(sum, l2.next);
                prev = prev.next; l2 = l2.next;
            }
        }

        if(carry == 1){
            prev.next = new ListNode(1,null);
        }


        return result.next;

    }
}
