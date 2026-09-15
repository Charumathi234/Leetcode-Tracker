// Last updated: 9/15/2026, 4:25:24 PM
1import java.util.*;
2
3class Solution {
4    public int largestPathValue(String colors, int[][] edges) {
5        int n = colors.length();
6
7        List<Integer>[] graph = new ArrayList[n];
8        int[] indegree = new int[n];
9
10        for (int i = 0; i < n; i++) {
11            graph[i] = new ArrayList<>();
12        }
13
14        for (int[] edge : edges) {
15            int u = edge[0];
16            int v = edge[1];
17
18            graph[u].add(v);
19            indegree[v]++;
20        }
21
22        int[][] dp = new int[n][26];
23
24        Queue<Integer> queue = new LinkedList<>();
25
26        for (int i = 0; i < n; i++) {
27            if (indegree[i] == 0) {
28                queue.offer(i);
29            }
30        }
31
32        int visited = 0;
33        int ans = 0;
34
35        while (!queue.isEmpty()) {
36            int node = queue.poll();
37            visited++;
38
39            int color = colors.charAt(node) - 'a';
40
41            dp[node][color]++;
42
43            for (int c = 0; c < 26; c++) {
44                ans = Math.max(ans, dp[node][c]);
45            }
46
47            for (int next : graph[node]) {
48
49                for (int c = 0; c < 26; c++) {
50                    dp[next][c] = Math.max(
51                            dp[next][c],
52                            dp[node][c]
53                    );
54                }
55
56                indegree[next]--;
57
58                if (indegree[next] == 0) {
59                    queue.offer(next);
60                }
61            }
62        }
63
64        if (visited != n) {
65            return -1;
66        }
67
68        return ans;
69    }
70}