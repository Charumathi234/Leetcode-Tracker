// Last updated: 10/8/2026, 10:16:13 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int num : nums) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7        PriorityQueue<Integer> pq = new PriorityQueue<>(
8            (a, b) -> map.get(b) - map.get(a)
9        );
10        for (int num : map.keySet()) {
11            pq.add(num);
12        }
13        int[] ans = new int[k];
14        for (int i = 0; i < k; i++) {
15            ans[i] = pq.poll();
16        }
17        return ans;
18    }
19}