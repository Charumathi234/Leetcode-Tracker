// Last updated: 10/8/2026, 10:11:20 AM
1class Solution {
2    public boolean kLengthApart(int[] nums, int k) {
3        int last = -1;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] == 1) {
6                if (last != -1 && i - last - 1 < k) {
7                    return false;
8                }
9                last = i;
10            }
11        }
12        return true;
13    }
14}