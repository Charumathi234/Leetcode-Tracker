// Last updated: 8/28/2026, 9:04:25 AM
1class Solution {
2    public int oddCells(int m, int n, int[][] indices) {
3        int[] rows = new int[m];
4        int[] cols = new int[n];
5
6        for (int[] index : indices) {
7            rows[index[0]]++;
8            cols[index[1]]++;
9        }
10
11        int count = 0;
12
13        for (int i = 0; i < m; i++) {
14            for (int j = 0; j < n; j++) {
15                if ((rows[i] + cols[j]) % 2 == 1) {
16                    count++;
17                }
18            }
19        }
20
21        return count;
22    }
23}