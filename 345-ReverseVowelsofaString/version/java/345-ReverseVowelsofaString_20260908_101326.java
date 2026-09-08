// Last updated: 9/8/2026, 10:13:26 AM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] arr = s.toCharArray();
4        int left = 0;
5        int right = arr.length - 1;
6        while (left < right) {
7            while (left < right && !isVowel(arr[left])) {
8                left++;
9            }
10            while (left < right && !isVowel(arr[right])) {
11                right--;
12            }
13            char temp = arr[left];
14            arr[left] = arr[right];
15            arr[right] = temp;
16            left++;
17            right--;
18        }
19        return new String(arr);
20    }
21    private boolean isVowel(char c) {
22        return c == 'a' || c == 'e' || c == 'i' ||
23               c == 'o' || c == 'u' ||
24               c == 'A' || c == 'E' || c == 'I' ||
25               c == 'O' || c == 'U';
26    }
27}