// Last updated: 8/5/2026, 9:05:10 PM
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int[] freq = new int[26];
4        for (char task : tasks) {
5            freq[task - 'A']++;
6        }
7        int maxFreq = 0;
8        for (int count : freq) {
9            maxFreq = Math.max(maxFreq, count);
10        }
11        int maxCount = 0;
12        for (int count : freq) {
13            if (count == maxFreq) {
14                maxCount++;
15            }
16        }
17        return Math.max(tasks.length,
18                (maxFreq - 1) * (n + 1) + maxCount);
19    }
20}