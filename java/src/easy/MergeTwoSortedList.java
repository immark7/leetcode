package easy;

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 != null ? list1 : list2;

        return dummy.next;
    }
}

// Solution using Recursion
// class Solution {

//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if (list1 == null) return list2;
//         if (list2 == null) return list1;

//         if (list1.val < list2.val) {
//             list1.next = mergeTwoLists(list1.next, list2);
//             return list1;
//         } else {
//             list2.next = mergeTwoLists(list2.next, list1);
//             return list2;
//         }
//     }
// }