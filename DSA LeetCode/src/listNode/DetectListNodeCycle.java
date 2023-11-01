package listNode;

public class DetectListNodeCycle {

    public static void main(String[] args) {

        ListNode temp1 = new ListNode(6);

        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(6);//begin cycle
        l1.next.next.next.next =  new ListNode(7);
        l1.next.next.next.next.next =  new ListNode(8);
        l1.next.next.next.next.next.next =  l1.next.next.next;//begin cycle

        ListNode listNode = detectCycle(l1);
        System.out.println(listNode.val);//6
    }


    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode index1 = fast;
                ListNode index2 = head;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }

        return null;
    }
}
