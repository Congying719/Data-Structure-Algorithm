package listNode;

import static listNode.ListNode.printList;

public class ReverseListNodeLC206 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        printList(l1);
        ListNode listNode = reverseListNode(l1);
        printList(listNode);
    }

    public static ListNode reverseListNode(ListNode ln) {
        ListNode pre = null;
        ListNode cur = ln;
        ListNode temp = null;
        while (cur != null) {

            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;

        }
        return pre;
    }
}
