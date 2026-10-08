// Last updated: 10/8/2026, 9:21:55 AM
1class Solution {
2    HashMap<Integer, Integer> map = new HashMap<>();
3    Random random = new Random();
4    int size;
5    public Solution(int n, int[] blacklist) {
6         size = n - blacklist.length;
7
8        HashSet<Integer> set = new HashSet<>();
9
10        for (int x : blacklist) {
11            set.add(x);
12        }
13
14        int last = n - 1;
15
16        for (int x : blacklist) {
17
18            if (x < size) {
19
20                while (set.contains(last)) {
21                    last--;
22                }
23
24                map.put(x, last);
25                last--;
26            }
27        }
28    }
29    
30    public int pick() {
31        int x = random.nextInt(size);
32
33        if (map.containsKey(x)) {
34            return map.get(x);
35        }
36
37        return x;
38    }
39}
40
41/**
42 * Your Solution object will be instantiated and called as such:
43 * Solution obj = new Solution(n, blacklist);
44 * int param_1 = obj.pick();
45 */