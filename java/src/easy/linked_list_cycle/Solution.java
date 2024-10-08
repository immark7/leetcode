package easy.linked_list_cycle;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// Fast and slow pointers
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
