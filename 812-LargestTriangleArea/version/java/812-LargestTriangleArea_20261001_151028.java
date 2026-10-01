// Last updated: 10/1/2026, 3:10:28 PM
1class Solution {
2    public double largestTriangleArea(int[][] points) {
3        double maxArea = 0;
4
5        for (int i = 0; i < points.length; i++) {
6            for (int j = i + 1; j < points.length; j++) {
7                for (int k = j + 1; k < points.length; k++) {
8
9                    double area = Math.abs(
10                        points[i][0] * (points[j][1] - points[k][1]) +
11                        points[j][0] * (points[k][1] - points[i][1]) +
12                        points[k][0] * (points[i][1] - points[j][1])
13                    ) / 2.0;
14
15                    maxArea = Math.max(maxArea, area);
16                }
17            }
18        }
19
20        return maxArea;
21    }
22}