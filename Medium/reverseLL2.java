class reverseLL2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head == null || head.next == null || left == right)
            return head;
        
        ListNode temp, curr, prev, tempHead;
        curr = head;
        prev = null;
        tempHead = head;
        int count = 1;
        
        while(count < left){
            ++count;
            prev = curr;
            curr = curr.next;
        }
        
        ListNode prevL = null;
        ListNode leftNode = null;
        for(int i = left; i <= right;i++){
            
            if(i == left){
                prevL = prev;
                leftNode = curr;
            }
            
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
            if(i == right){
//                 if left starts from 1
                if(prevL == null)
                    head = prev;
//                 else left has some value
                else
                    prevL.next = prev;
            
                leftNode.next = curr;
            }
            
        }
        
        return head;
    }
}
