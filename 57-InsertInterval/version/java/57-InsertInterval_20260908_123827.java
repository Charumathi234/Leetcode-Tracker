// Last updated: 9/8/2026, 12:38:27 PM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> result = new ArrayList<>();
4        int i = 0;
5        while (i < intervals.length &&
6               intervals[i][1] < newInterval[0]) {
7
8            result.add(intervals[i]);
9            i++;
10        }
11        while (i < intervals.length &&
12               intervals[i][0] <= newInterval[1]) {
13
14            newInterval[0] =
15                Math.min(newInterval[0], intervals[i][0]);
16
17            newInterval[1] =
18                Math.max(newInterval[1], intervals[i][1]);
19
20            i++;
21        }
22        result.add(newInterval);
23        while (i < intervals.length) {
24            result.add(intervals[i]);
25            i++;
26        }
27        return result.toArray(new int[result.size()][]);
28    }
29}