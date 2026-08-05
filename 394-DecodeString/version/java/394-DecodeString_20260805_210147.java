// Last updated: 8/5/2026, 9:01:47 PM
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        for (int[] op : ops) {
4            m = Math.min(m, op[0]);
5            n = Math.min(n, op[1]);
6        }
7
8        return m * n;
9    }
10}