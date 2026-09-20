// Last updated: 9/20/2026, 9:21:17 AM
1class Solution {
2    public long countIntersectingIntervals(int[][] intervals) {
3        int n =intervals.length;
4        int[] start =new int[n];
5        int[] end = new int[n];
6        for(int i=0;i<n;i++){
7            start[i]=intervals[i][0];
8            end[i]=intervals[i][1];
9        }
10        Arrays.sort(start);
11        Arrays.sort(end);
12        long ans =0;
13        int j=0;
14        for(int i=0;i<n;i++){
15            while(j<n && end[j]<start[i]){
16                j++;
17            }
18            ans +=i-j;
19        }
20        return ans;
21    }
22}