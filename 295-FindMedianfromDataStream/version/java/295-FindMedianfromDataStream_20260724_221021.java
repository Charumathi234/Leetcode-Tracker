// Last updated: 7/24/2026, 10:10:21 PM
1class MedianFinder {
2
3    PriorityQueue<Integer> maxHeap;
4    PriorityQueue<Integer> minHeap;
5
6    public MedianFinder() {
7        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
8        minHeap = new PriorityQueue<>();
9    }
10
11    public void addNum(int num) {
12        maxHeap.offer(num);
13        minHeap.offer(maxHeap.poll());
14
15        if (minHeap.size() > maxHeap.size()) {
16            maxHeap.offer(minHeap.poll());
17        }
18    }
19
20    public double findMedian() {
21        if (maxHeap.size() > minHeap.size()) {
22            return maxHeap.peek();
23        }
24        return (maxHeap.peek() + minHeap.peek()) / 2.0;
25    }
26}
27
28/**
29 * Your MedianFinder object will be instantiated and called as such:
30 * MedianFinder obj = new MedianFinder();
31 * obj.addNum(num);
32 * double param_2 = obj.findMedian();
33 */