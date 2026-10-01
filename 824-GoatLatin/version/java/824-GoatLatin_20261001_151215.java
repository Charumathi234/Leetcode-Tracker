// Last updated: 10/1/2026, 3:12:15 PM
1class Solution {
2    public String toGoatLatin(String sentence) {
3
4        String[] words = sentence.split(" ");
5        StringBuilder ans = new StringBuilder();
6
7        for (int i = 0; i < words.length; i++) {
8
9            String word = words[i];
10
11            if (!isVowel(word.charAt(0))) {
12                word = word.substring(1) + word.charAt(0);
13            }
14
15            word += "ma";
16
17            for (int j = 0; j <= i; j++) {
18                word += "a";
19            }
20
21            ans.append(word);
22
23            if (i < words.length - 1) {
24                ans.append(" ");
25            }
26        }
27
28        return ans.toString();
29    }
30
31    private boolean isVowel(char c) {
32        return c == 'a' || c == 'e' || c == 'i' ||
33               c == 'o' || c == 'u' ||
34               c == 'A' || c == 'E' || c == 'I' ||
35               c == 'O' || c == 'U';
36    }
37}