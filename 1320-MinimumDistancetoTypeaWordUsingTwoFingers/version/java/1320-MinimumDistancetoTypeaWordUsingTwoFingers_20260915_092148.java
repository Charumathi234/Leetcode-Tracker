// Last updated: 9/15/2026, 9:21:48 AM
1class Solution {
2    public int minimumDistance(String word) {
3        int[][] dp = new int[27][27];
4        for (int i = 0; i < 27; i++) {
5            for (int j = 0; j < 27; j++) {
6                dp[i][j] = 1000000;
7            }
8        }
9        dp[26][26] = 0;
10        for (char ch : word.toCharArray()) {
11            int current = ch - 'A';
12            int[][] next = new int[27][27];
13            for (int i = 0; i < 27; i++) {
14                for (int j = 0; j < 27; j++) {
15                    next[i][j] = 1000000;
16                }
17            }
18            for (int left = 0; left < 27; left++) {
19                for (int right = 0; right < 27; right++) {
20                    if (dp[left][right] == 1000000)
21                        continue;
22                    next[current][right] =
23                        Math.min(
24                            next[current][right],
25                            dp[left][right] + distance(left, current)
26                        );
27                    next[left][current] =
28                        Math.min(
29                            next[left][current],
30                            dp[left][right] + distance(right, current)
31                        );
32                }
33            }
34            dp = next;
35        }
36        int answer = 1000000;
37        for (int i = 0; i < 27; i++) {
38            for (int j = 0; j < 27; j++) {
39                answer = Math.min(answer, dp[i][j]);
40            }
41        }
42        return answer;
43    }
44    public int distance(int a, int b) {
45        if (a == 26)
46            return 0;
47        int row1 = a / 6;
48        int col1 = a % 6;
49        int row2 = b / 6;
50        int col2 = b % 6;
51        return Math.abs(row1 - row2) +
52               Math.abs(col1 - col2);
53    }
54}