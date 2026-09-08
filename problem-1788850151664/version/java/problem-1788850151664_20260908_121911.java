// Last updated: 9/8/2026, 12:19:11 PM
1class Solution {
2    public int removePalindromeSub(String s) {
3          if (s.length() == 0) {
4            return 0;
5        }
6
7        if (isPalindrome(s)) {
8            return 1;
9        }
10
11        return 2;
12    }
13    private boolean isPalindrome(String s) {
14     int left = 0;
15        int right = s.length() - 1;
16
17        while (left < right) {
18            if (s.charAt(left) != s.charAt(right)) {
19                return false;
20            }
21
22            left++;
23            right--;
24        }
25
26        return true;
27    }
28}