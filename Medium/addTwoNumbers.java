class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode();
        int carry = 0;
        int sum = 0;
        ListNode curr = new ListNode(0);
        head = curr;
        do{
            int total = carry;
            
            if(l1!=null){
                total += l1.val;
                l1 = l1.next;
            }
            
            if(l2!=null){
                total += l2.val;
                l2 = l2.next;
            }
                
            
            sum = total % 10;
            carry = total / 10;
            
            ListNode temp = new ListNode(sum);
            
            curr.next = temp;
            curr = curr.next;
        }
        while(l1!= null || l2 != null || carry != 0);
        
        return head.next;
    }
}
