// Last updated: 10/8/2026, 10:06:11 AM
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) {
4            return x;
5        }
6        int left = 1;
7        int right = x / 2;
8        int ans = 0;
9        while (left <= right) {
10            int mid = left + (right - left) / 2;
11
12            if (mid <= x / mid) {
13                ans = mid;
14                left = mid + 1;
15            } else {
16                right = mid - 1;
17            }
18        }
19        return ans;
20    }
21}