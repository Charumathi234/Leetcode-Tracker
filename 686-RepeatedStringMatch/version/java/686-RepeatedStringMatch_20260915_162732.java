// Last updated: 9/15/2026, 4:27:32 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3
4        if (s1.length() > s2.length()) {
5            return false;
6        }
7
8        int[] count = new int[26];
9
10        for (char ch : s1.toCharArray()) {
11            count[ch - 'a']++;
12        }
13
14        int left = 0;
15        int right = 0;
16        int required = s1.length();
17
18        while (right < s2.length()) {
19
20            char ch = s2.charAt(right);
21
22            if (count[ch - 'a'] > 0) {
23                required--;
24            }
25
26            count[ch - 'a']--;
27            right++;
28
29            if (right - left > s1.length()) {
30                char removed = s2.charAt(left);
31
32                count[removed - 'a']++;
33
34                if (count[removed - 'a'] > 0) {
35                    required++;
36                }
37
38                left++;
39            }
40
41            if (required == 0) {
42                return true;
43            }
44        }
45
46        return false;
47    }
48}