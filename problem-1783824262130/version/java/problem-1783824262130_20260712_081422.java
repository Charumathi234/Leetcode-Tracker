// Last updated: 7/12/2026, 8:14:22 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] s = startTime.split(":");
4        String[] e = endTime.split(":");
5        int sSec =Integer.parseInt(s[0])*3600+Integer.parseInt(s[1])*60+Integer.parseInt(s[2]);
6        int eSec =Integer.parseInt(e[0])*3600+Integer.parseInt(e[1])*60+Integer.parseInt(e[2]);
7        return eSec-sSec;
8    }
9}