// Last updated: 10/1/2026, 3:06:56 PM
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3        
4        return rec1[0] < rec2[2] &&
5               rec1[2] > rec2[0] &&
6               rec1[1] < rec2[3] &&
7               rec1[3] > rec2[1];
8    }
9}