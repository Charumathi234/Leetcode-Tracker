// Last updated: 10/8/2026, 10:14:48 AM
1class Solution {
2    public int maximumGap(int[] nums) {
3        if (nums.length < 2) {
4            return 0;
5        }
6        Arrays.sort(nums);
7        int maxGap = 0;
8        for (int i = 1; i < nums.length; i++) {
9            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
10        }
11        return maxGap;
12    }
13}