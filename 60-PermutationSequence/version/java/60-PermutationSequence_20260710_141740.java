// Last updated: 7/10/2026, 2:17:40 PM
1import java.util.HashMap;
2
3class Solution {
4    public boolean containsNearbyDuplicate(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        for (int i = 0; i < nums.length; i++) {
8            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
9                return true;
10            }
11            map.put(nums[i], i);
12        }
13
14        return false;
15    }
16}