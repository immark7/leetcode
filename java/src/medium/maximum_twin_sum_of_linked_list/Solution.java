package medium.maximum_twin_sum_of_linked_list;

import common.ListNode;

// Fast and slow pointers
class Solution {
    public int pairSum(ListNode head) {
        if (head == null || head.next == null) {
            return 0;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfHead = reverseList(slow);

        int maxTwinSum = Integer.MIN_VALUE;
        ListNode firstHalfHead = head;
        while (secondHalfHead != null) {
            int twinSum = firstHalfHead.val + secondHalfHead.val;
            if (twinSum > maxTwinSum) {
                maxTwinSum = twinSum;
            }
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }

        return maxTwinSum;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
