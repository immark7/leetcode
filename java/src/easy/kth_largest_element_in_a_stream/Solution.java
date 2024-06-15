package easy.kth_largest_element_in_a_stream;
import java.util.PriorityQueue;

class Solution {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public void KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }

}
