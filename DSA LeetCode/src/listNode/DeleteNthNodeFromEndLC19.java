package listNode;

public class DeleteNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(6);//begin cycle
        l1.next.next.next.next =  new ListNode(7);
        l1.next.next.next.next.next =  new ListNode(8);
        l1.next.next.next.next.next.next =  l1.next.next.next;//begin cycle
    }

    
}
