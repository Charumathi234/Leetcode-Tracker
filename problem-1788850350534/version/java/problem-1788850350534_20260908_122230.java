// Last updated: 9/8/2026, 12:22:30 PM
1class Solution {
2    public String sortString(String s) {
3        int[] count = new int[26];
4        for (char c : s.toCharArray()) {
5            count[c - 'a']++;
6        }
7        StringBuilder result = new StringBuilder();
8        while (result.length() < s.length()) {
9            for (int i = 0; i < 26; i++) {
10                if (count[i] > 0) {
11                    result.append((char) ('a' + i));
12                    count[i]--;
13                }
14            }
15            for (int i = 25; i >= 0; i--) {
16                if (count[i] > 0) {
17                    result.append((char) ('a' + i));
18                    count[i]--;
19                }
20            }
21        }
22        return result.toString();
23    }
24}