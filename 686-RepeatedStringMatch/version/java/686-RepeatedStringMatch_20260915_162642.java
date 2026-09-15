// Last updated: 9/15/2026, 4:26:42 PM
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3
4        StringBuilder sb = new StringBuilder();
5        int count = 0;
6
7        while (sb.length() < b.length()) {
8            sb.append(a);
9            count++;
10        }
11
12        if (sb.toString().contains(b)) {
13            return count;
14        }
15
16        sb.append(a);
17        count++;
18
19        if (sb.toString().contains(b)) {
20            return count;
21        }
22
23        return -1;
24    }
25}