// Last updated: 9/8/2026, 12:16:54 PM
1class Solution {
2    public String freqAlphabets(String s) {
3        StringBuilder result = new StringBuilder();
4
5        for (int i = 0; i < s.length();) {
6
7            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
8                // Two-digit number: 10# to 26#
9                int num = Integer.parseInt(s.substring(i, i + 2));
10
11                result.append((char) ('a' + num - 1));
12
13                i += 3;
14            } else {
15                // One-digit number: 1 to 9
16                int num = s.charAt(i) - '0';
17
18                result.append((char) ('a' + num - 1));
19
20                i++;
21            }
22        }
23
24        return result.toString();
25    }
26}