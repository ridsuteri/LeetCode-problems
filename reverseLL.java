class reverseLL {
    public ListNode reverseList(ListNode head) {
     
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = head.next;
        ListNode ans = reverseList(head.next);
        temp.next = head;
        head.next = null;
        
        return ans;
    }
}
