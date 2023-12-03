package medium.browser_history;

class ListNode {
    String url;
    ListNode back;
    ListNode next;

    ListNode (String url){
        this.url = url;
        this.next = null;
        this.back = null;
    }

}

class DesignBrowserHistory {
    ListNode head;
    ListNode current;

    public DesignBrowserHistory(String homepage) {
        head = new ListNode(homepage);
        current = head;
    }

    public void visit(String url) {
        current.next = new ListNode(url);
        current.next.back = current;
        current = current.next;
    }

    public String back(int steps) {
        while(steps > 0 && current.back != null) {
            current = current.back;
            steps--;
        }

        return current.url;
    }

    public String forward(int steps) {
        while(steps > 0 && current.next != null ){
            current = current.next;
            steps--;
        }
        return current.url;
    }
}