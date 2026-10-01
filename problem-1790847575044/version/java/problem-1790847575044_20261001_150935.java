// Last updated: 10/1/2026, 3:09:35 PM
1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        int lines = 1;
4        int currentWidth = 0;
5
6        for (char c : s.toCharArray()) {
7            int width = widths[c - 'a'];
8
9            if (currentWidth + width > 100) {
10                lines++;
11                currentWidth = width;
12            } else {
13                currentWidth += width;
14            }
15        }
16
17        return new int[]{lines, currentWidth};
18    }
19}