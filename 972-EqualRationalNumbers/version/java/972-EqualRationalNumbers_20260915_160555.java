// Last updated: 9/15/2026, 4:05:55 PM
1class Solution {
2    public boolean checkPartitioning(String s) {
3        int n = s.length();
4        boolean[][] dp = new boolean[n][n];
5        for (int i = 0; i < n; i++) {
6            dp[i][i] = true;
7        }
8        for (int len = 2; len <= n; len++) {
9            for (int i = 0; i + len <= n; i++) {
10                int j = i + len - 1;
11                if (s.charAt(i) == s.charAt(j)) {
12                    if (len == 2 || dp[i + 1][j - 1]) {
13                        dp[i][j] = true;
14                    }
15                }
16            }
17        }
18        for (int i = 0; i < n - 2; i++) {
19            for (int j = i + 1; j < n - 1; j++) {
20                if (dp[0][i] &&
21                    dp[i + 1][j] &&
22                    dp[j + 1][n - 1]) {
23                    return true;
24         
25                }
26            }
27        }
28        return false;
29    }
30}