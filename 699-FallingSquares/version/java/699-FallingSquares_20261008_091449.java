// Last updated: 10/8/2026, 9:14:49 AM
1class Solution {
2    public List<Integer> fallingSquares(int[][] positions) {
3       List<Integer> ans = new ArrayList<>();
4        int n = positions.length;
5        int[] height = new int[n];
6        int maxHeight = 0;
7        for (int i = 0; i < n; i++) {
8            int left = positions[i][0];
9            int side = positions[i][1];
10            int right = left + side;
11            int baseHeight = 0;
12            for (int j = 0; j < i; j++) {
13                int prevLeft = positions[j][0];
14                int prevRight = prevLeft + positions[j][1];
15                if (left < prevRight && right > prevLeft) {
16                    baseHeight = Math.max(baseHeight, height[j]);
17                }
18            }
19            height[i] = baseHeight + side;
20            maxHeight = Math.max(maxHeight, height[i]);
21            ans.add(maxHeight);
22        }
23        return ans; 
24    }
25}