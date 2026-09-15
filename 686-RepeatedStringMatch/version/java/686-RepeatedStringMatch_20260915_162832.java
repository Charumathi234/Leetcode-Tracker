// Last updated: 9/15/2026, 4:28:32 PM
1class Solution {
2    public String fractionAddition(String expression) {
3
4        int numerator = 0;
5        int denominator = 1;
6
7        int i = 0;
8        int n = expression.length();
9
10        while (i < n) {
11
12            int sign = 1;
13
14            if (expression.charAt(i) == '+') {
15                i++;
16            } else if (expression.charAt(i) == '-') {
17                sign = -1;
18                i++;
19            }
20
21            int num = 0;
22
23            while (i < n && Character.isDigit(expression.charAt(i))) {
24                num = num * 10 + expression.charAt(i) - '0';
25                i++;
26            }
27
28            i++; // Skip '/'
29
30            int den = 0;
31
32            while (i < n && Character.isDigit(expression.charAt(i))) {
33                den = den * 10 + expression.charAt(i) - '0';
34                i++;
35            }
36
37            num *= sign;
38
39            numerator = numerator * den + num * denominator;
40            denominator = denominator * den;
41
42            int gcd = gcd(Math.abs(numerator), denominator);
43
44            numerator /= gcd;
45            denominator /= gcd;
46        }
47
48        return numerator + "/" + denominator;
49    }
50
51    private int gcd(int a, int b) {
52        while (b != 0) {
53            int temp = a % b;
54            a = b;
55            b = temp;
56        }
57
58        return a;
59    }
60}