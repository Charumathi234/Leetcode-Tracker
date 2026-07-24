// Last updated: 7/24/2026, 9:49:35 PM
1class Solution {
2    public int maxFreqSum(String s) {
3        int[] count = new int[26];
4
5        for (char c : s.toCharArray()) {
6            count[c - 'a']++;
7        }
8
9        int maxVowel = 0;
10        int maxConsonant = 0;
11
12        for (int i = 0; i < 26; i++) {
13            char c = (char) ('a' + i);
14
15            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
16                maxVowel = Math.max(maxVowel, count[i]);
17            } else {
18                maxConsonant = Math.max(maxConsonant, count[i]);
19            }
20        }
21
22        return maxVowel + maxConsonant;
23    }
24}