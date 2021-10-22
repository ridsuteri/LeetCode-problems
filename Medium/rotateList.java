class rotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = head;
        int sizeOfList = 1;

        if(head == null || head.next == null){
            return head;
        }
        while(curr.next != null){
            curr = curr.next;
            sizeOfList++;
        }

        for (int i = 0; i < k % sizeOfList; i++) {
            curr = head;
            prev = head;
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            curr.next = head;
            head = curr;
        }
        return head;
    }
}
