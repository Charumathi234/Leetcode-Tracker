// Last updated: 8/5/2026, 9:03:53 PM
1class Solution {
2    public int findIntegers(int n) {
3        int[] dp = new int[32];
4        dp[0] = 1;
5        dp[1] = 2;
6        for (int i = 2; i < 32; i++) {
7            dp[i] = dp[i - 1] + dp[i - 2];
8        }
9
10        int ans = 0;
11        int prevBit = 0;
12
13        for (int i = 30; i >= 0; i--) {
14            if ((n & (1 << i)) != 0) {
15                ans += dp[i];
16                if (prevBit == 1) {
17                    return ans;
18                }
19
20                prevBit = 1;
21            } else {
22                prevBit = 0;
23            }
24        }
25
26        return ans + 1;
27    }
28}