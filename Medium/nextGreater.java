class nextGreater {
    public int[] nextLargerNodes(ListNode head) {
        ListNode p = head;
        ListNode n = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean flag = false;
        
        if(p.next!= null)
            n = p.next;
        else
            arr.add(0);
        
        while(p!=null && p.next!=null){
            while(n!=null){
                if(n.val > p.val){
                    arr.add(n.val);
                    flag = true;
                    break;
                }
                
                else
                    n = n.next;
            }
            
            if(!flag)
                arr.add(0);
            flag = false;
            p = p.next;
            if(p.next!=null)
                n = p.next;
            if(p == n || n == null){
                arr.add(0);
            }
        }

        return arr.stream().mapToInt(i -> i).toArray();
    }
}
