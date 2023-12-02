package easy;

class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    public DoublyListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}


public class DesignLinkedList {
    DoublyListNode head;
    DoublyListNode tail;

    public DesignLinkedList() {
        head = new DoublyListNode(0);
        tail = new DoublyListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        DoublyListNode cur = head.next;
        while (cur != null && index > 0) {
            cur = cur.next;
            index -= 1;
        }

        if (cur != null) {
            return cur.val;
        }

        return -1;
    }

    public void addAtHead(int val) {
        DoublyListNode node = new DoublyListNode(val);
        DoublyListNode next = head.next;
        DoublyListNode prev = head;
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    public void addAtTail(int val) {
        DoublyListNode node = new DoublyListNode(val);
        DoublyListNode next = tail;
        DoublyListNode prev = tail.prev;
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    public void addAtIndex(int index, int val) {
        DoublyListNode cur = head.next;
        while (cur != null && index > 0) {
            cur = cur.next;
            index -= 1;
        }
        if (cur != null && index == 0) {
            DoublyListNode node = new DoublyListNode(val);
            DoublyListNode next = cur;
            DoublyListNode prev = cur.prev;
            prev.next = node;
            next.prev = node;
            node.next = next;
            node.prev = prev;
        }
    }

    public void deleteAtIndex(int index) {
        DoublyListNode cur = head.next;
        while (cur != null && index > 0) {
            cur = cur.next;
            index -= 1;
        }
        if (cur != null && cur != tail && index == 0) {
            DoublyListNode next = cur.next;
            DoublyListNode prev = cur.prev;
            next.prev = prev;
            prev.next = next;
        }
    }
}