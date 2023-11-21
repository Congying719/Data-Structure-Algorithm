package listNode;


import static listNode.ListNode.printList;

public class RemoveListNodeLC203 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(1);
        l1.next.next.next.next.next = new ListNode(5);

        ListNode result = removeListNode(l1,1);
        printList(result);
    }

    public static ListNode removeListNode(ListNode ln, int val) {
        ListNode dummy = new ListNode(-1,ln);
        ListNode cur = ln;
        ListNode pre = dummy.next;
        while(cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
