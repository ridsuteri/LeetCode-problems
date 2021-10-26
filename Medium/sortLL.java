class sortLL {
   public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode left = head;
        ListNode right = getMid(head);
        // one step to right
        ListNode next = right.next;
        right.next = null;
        right = next;
        
        left = sortList(left);
        right = sortList(right);
        
        return merge(left, right);
    }
    
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;//+1
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    private ListNode merge(ListNode left, ListNode right) {
        ListNode resultList = new ListNode();
        ListNode tail = resultList;
        while (right != null && left != null) {
            if (right.val < left.val) {
                tail.next = right;
                right = right.next;
            } else {
                tail.next = left;
                left = left.next;
            }
            tail = tail.next;
        }

        if (left == null && right != null) {
            tail.next = right;
        } else if (left != null && right == null) {
            tail.next = left;
        }
        return resultList.next;
    }
}
