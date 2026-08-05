// Last updated: 8/5/2026, 9:08:23 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3         Arrays.sort(nums);
4
5        int n = nums.length;
6
7        return Math.max(
8            nums[n - 1] * nums[n - 2] * nums[n - 3],
9            nums[0] * nums[1] * nums[n - 1]
10        );
11    }
12}