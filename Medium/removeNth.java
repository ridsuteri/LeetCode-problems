class removeNth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode resultNode = new ListNode(0);
        resultNode.next = head;
        ListNode fast = resultNode;
        ListNode slow = resultNode;
        
        while (n-- > 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return resultNode.next;
    }
}
