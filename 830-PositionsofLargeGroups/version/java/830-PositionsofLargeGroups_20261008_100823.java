// Last updated: 10/8/2026, 10:08:23 AM
1class Solution {
2    public List<List<Integer>> largeGroupPositions(String s) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int start = 0;
5        for (int i = 1; i <= s.length(); i++) {
6            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
7                if (i - start >= 3) {
8                    ans.add(Arrays.asList(start, i - 1));
9                }
10                start = i;
11            }
12        }
13        return ans;
14    }
15}