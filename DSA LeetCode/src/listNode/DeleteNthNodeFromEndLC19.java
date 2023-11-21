package listNode;


import static listNode.ListNode.printList;

public class DeleteNthNodeFromEndLC19 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(6);
        l1.next.next.next.next =  new ListNode(7);
        l1.next.next.next.next.next =  new ListNode(8);
        l1.next.next.next.next.next.next =  new ListNode(9);

        ListNode listNode = deleteNth(l1,3);
        printList(listNode); //3 4 5 6 8 9
    }

    // use two pointer
    public static ListNode deleteNth(ListNode ln, int n) {

        ListNode dummy = new ListNode(-1, ln);
        ListNode fast = dummy.next;
        ListNode slow = dummy.next;

        while (n >= 0 && fast != null) {
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;


        return  dummy.next;
    }

}
