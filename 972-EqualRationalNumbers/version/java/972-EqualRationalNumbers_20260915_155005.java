// Last updated: 9/15/2026, 3:50:05 PM
1import java.math.BigInteger;
2
3class Solution {
4    public boolean isRationalEqual(String s, String t) {
5        Fraction a = convert(s);
6        Fraction b = convert(t);
7
8        return a.num.multiply(b.den)
9                .equals(b.num.multiply(a.den));
10    }
11
12    private Fraction convert(String s) {
13        String[] parts = s.split("\\.", -1);
14
15        BigInteger integer = new BigInteger(parts[0]);
16        String decimal = parts.length > 1 ? parts[1] : "";
17
18        int open = decimal.indexOf('(');
19
20        if (open == -1) {
21            BigInteger den = BigInteger.TEN.pow(decimal.length());
22            BigInteger num = integer.multiply(den)
23                    .add(new BigInteger(decimal.isEmpty() ? "0" : decimal));
24            return new Fraction(num, den);
25        }
26
27        String nonRepeat = decimal.substring(0, open);
28        String repeat = decimal.substring(open + 1, decimal.length() - 1);
29
30        int m = nonRepeat.length();
31        int n = repeat.length();
32
33        BigInteger tenM = BigInteger.TEN.pow(m);
34        BigInteger tenN = BigInteger.TEN.pow(n);
35
36        BigInteger den = tenM.multiply(tenN.subtract(BigInteger.ONE));
37
38        BigInteger num = integer.multiply(den);
39
40        if (!nonRepeat.isEmpty()) {
41            num = num.add(new BigInteger(nonRepeat)
42                    .multiply(tenN.subtract(BigInteger.ONE)));
43        }
44
45        num = num.add(new BigInteger(repeat));
46
47        return new Fraction(num, den);
48    }
49
50    static class Fraction {
51        BigInteger num, den;
52
53        Fraction(BigInteger num, BigInteger den) {
54            this.num = num;
55            this.den = den;
56        }
57    }
58}