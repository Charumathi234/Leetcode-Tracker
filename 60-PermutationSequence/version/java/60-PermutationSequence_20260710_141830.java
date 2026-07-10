// Last updated: 7/10/2026, 2:18:30 PM
1class Solution {
2    public String getPermutation(int n, int k) {
3        List<Integer> numbers = new ArrayList<>();
4        int[] fact = new int[n + 1];
5
6        fact[0] = 1;
7        for (int i = 1; i <= n; i++) {
8            fact[i] = fact[i - 1] * i;
9            numbers.add(i);
10        }
11
12        k--; 
13        StringBuilder result = new StringBuilder();
14
15        for (int i = n; i >= 1; i--) {
16            int index = k / fact[i - 1];
17            result.append(numbers.get(index));
18            numbers.remove(index);
19            k %= fact[i - 1];
20        }
21
22        return result.toString();
23    }
24}