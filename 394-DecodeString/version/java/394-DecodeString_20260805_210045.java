// Last updated: 8/5/2026, 9:00:45 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int num : nums) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7
8        int maxLength = 0;
9        for (int key : map.keySet()) {
10            if (map.containsKey(key + 1)) {
11                maxLength = Math.max(maxLength,
12                        map.get(key) + map.get(key + 1));
13            }
14        }
15
16        return maxLength;
17    }
18}