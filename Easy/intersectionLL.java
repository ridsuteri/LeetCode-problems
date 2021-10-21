public class intersectionLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)  return null;
        ListNode A = headA, B = headB;
        while(A != B){
            A = (A == null) ? headB : A.next;
            B = (B == null) ? headA : B.next;
        }
        return A;
    }
}
