package ListNode;

public class ReverseListNode {
    public static ListNode sumList(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        return listNode;
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
