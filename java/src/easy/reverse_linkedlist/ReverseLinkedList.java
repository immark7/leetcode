package easy.reverse_linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextCurrent = null;

        while (current != null) {
            nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }

        return previous;
    }
}

//Recursive version
//class Solution {
//
//    public ListNode reverseList(ListNode head) {
//        return rev(head, null);
//    }
//
//    public ListNode rev(ListNode node, ListNode pre) {
//        if (node == null) return pre;
//        ListNode temp = node.next;
//        node.next = pre;
//        return rev(temp, node);
//    }
//}
