// Last updated: 7/9/2026, 3:08:27 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
          PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}