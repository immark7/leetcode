package easy.implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private Queue<Integer> queue;

    public Solution() {
        this.queue = new LinkedList<>();
    }


    public static void main(String[] args) {
        Solution stack = new Solution();
        stack.push(10);
        stack.push(20);
        System.out.println("Top element: " + stack.top());
        System.out.println("Element popped: " + stack.pop());
        System.out.println("Top element: " + stack.top());
        System.out.println("Is stack empty " + stack.empty());
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.poll());
            size--;
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}