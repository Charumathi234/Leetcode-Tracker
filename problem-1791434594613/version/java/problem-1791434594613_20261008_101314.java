// Last updated: 10/8/2026, 10:13:14 AM
1class Solution {
2    public int maxPower(String s) {
3        int max = 1;
4        int count = 1;
5        for (int i = 1; i < s.length(); i++) {
6            if (s.charAt(i) == s.charAt(i - 1)) {
7                count++;
8            } else {
9                count = 1;
10            }
11            max = Math.max(max, count);
12        }
13        return max;
14    }
15}