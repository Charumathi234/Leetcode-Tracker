// Last updated: 10/21/2026, 3:26:32 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m = s1.length();
4        int n = s2.length();
5
6        if (m + n != s3.length()) {
7            return false;
8        }
9
10        boolean[][] dp = new boolean[m + 1][n + 1];
11        dp[0][0] = true;
12
13        for (int i = 0; i <= m; i++) {
14            for (int j = 0; j <= n; j++) {
15                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
16                    dp[i][j] |= dp[i - 1][j];
17                }
18
19                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
20                    dp[i][j] |= dp[i][j - 1];
21                }
22            }
23        }
24
25        return dp[m][n];
26    }
27}