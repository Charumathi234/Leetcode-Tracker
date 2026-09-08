// Last updated: 9/8/2026, 12:21:11 PM
1class Solution {
2    public int daysBetweenDates(String date1, String date2) {
3        return Math.abs(toDays(date1) - toDays(date2));
4    }
5    private int toDays(String date) {
6        int year = Integer.parseInt(date.substring(0, 4));
7        int month = Integer.parseInt(date.substring(5, 7));
8        int day = Integer.parseInt(date.substring(8, 10));
9        int[] daysInMonth = {
10            31, 28, 31, 30, 31, 30,
11            31, 31, 30, 31, 30, 31
12        };
13        int totalDays = 0;
14        for (int y = 0; y < year; y++) {
15            totalDays += isLeapYear(y) ? 366 : 365;
16        }
17        for (int m = 1; m < month; m++) {
18            totalDays += daysInMonth[m - 1];
19
20            if (m == 2 && isLeapYear(year)) {
21                totalDays++;
22            }
23        }
24        totalDays += day;
25        return totalDays;
26    }
27    private boolean isLeapYear(int year) {
28        return (year % 400 == 0) ||
29               (year % 4 == 0 && year % 100 != 0);
30    }
31}