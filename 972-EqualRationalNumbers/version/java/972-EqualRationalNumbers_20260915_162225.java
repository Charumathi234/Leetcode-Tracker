// Last updated: 9/15/2026, 4:22:25 PM
1import java.util.*;
2
3class Solution {
4    public int makeStringSorted(String s) {
5        int n = s.length();
6        long ans = 0;
7        long fact = 1;
8
9        int[] freq = new int[26];
10
11        for (int i = 0; i < n; i++) {
12            freq[s.charAt(i) - 'a']++;
13        }
14
15        for (int i = 0; i < n; i++) {
16            int smaller = 0;
17
18            for (int c = 0; c < s.charAt(i) - 'a'; c++) {
19                smaller += freq[c];
20            }
21
22            ans = (ans + smaller * factorial(n - i - 1, freq)) % 1000000007;
23
24            freq[s.charAt(i) - 'a']--;
25        }
26
27        return (int) ans;
28    }
29
30    private long factorial(int len, int[] freq) {
31        long numerator = 1;
32        long denominator = 1;
33
34        for (int i = 2; i <= len; i++) {
35            numerator = (numerator * i) % 1000000007;
36        }
37
38        for (int count : freq) {
39            for (int i = 2; i <= count; i++) {
40                denominator = (denominator * i) % 1000000007;
41            }
42        }
43
44        return numerator * modInverse(denominator) % 1000000007;
45    }
46
47    private long modInverse(long x) {
48        return power(x, 1000000005);
49    }
50
51    private long power(long a, long b) {
52        long result = 1;
53
54        while (b > 0) {
55            if ((b & 1) == 1) {
56                result = result * a % 1000000007;
57            }
58
59            a = a * a % 1000000007;
60            b >>= 1;
61        }
62
63        return result;
64    }
65}