// Last updated: 9/15/2026, 4:08:54 PM
1class Solution {
2    public int longestPalindrome(String word1, String word2) {
3        String s = word1 + word2;
4        int n = s.length();
5        int m = word1.length();
6        int[][] dp = new int[n][n];
7        for (int i = 0; i < n; i++) {
8            dp[i][i] = 1;
9        }
10        for (int len = 2; len <= n; len++) {
11            for (int i = 0; i + len <= n; i++) {
12                int j = i + len - 1;
13                if (s.charAt(i) == s.charAt(j)) {
14                    dp[i][j] = dp[i + 1][j - 1] + 2;
15                } else {
16                    dp[i][j] = Math.max(
17                            dp[i + 1][j],
18                            dp[i][j - 1]
19                    );
20                }
21            }
22        }
23        int ans = 0;
24        for (int i = 0; i < m; i++) {
25            for (int j = m; j < n; j++) {
26                if (s.charAt(i) == s.charAt(j)) {
27                    ans = Math.max(ans, dp[i][j]);
28                }
29            }
30        }
31        return ans;
32    }
33}