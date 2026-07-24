// Last updated: 7/24/2026, 10:12:50 PM
1class Solution {
2    public int maxCoins(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n + 2];
5        arr[0] = 1;
6        arr[n + 1] = 1;
7
8        for (int i = 0; i < n; i++) {
9            arr[i + 1] = nums[i];
10        }
11
12        int[][] dp = new int[n + 2][n + 2];
13
14        for (int len = 1; len <= n; len++) {
15            for (int left = 1; left <= n - len + 1; left++) {
16                int right = left + len - 1;
17
18                for (int k = left; k <= right; k++) {
19                    dp[left][right] = Math.max(
20                        dp[left][right],
21                        dp[left][k - 1]
22                        + arr[left - 1] * arr[k] * arr[right + 1]
23                        + dp[k + 1][right]
24                    );
25                }
26            }
27        }
28
29        return dp[1][n];
30    }
31}