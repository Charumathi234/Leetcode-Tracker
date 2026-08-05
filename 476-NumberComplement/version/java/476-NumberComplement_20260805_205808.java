// Last updated: 8/5/2026, 8:58:08 PM
1class Solution {
2    public int findComplement(int num) {
3        int mask = 1;
4        while (mask < num) {
5            mask = (mask << 1) | 1;
6        }
7
8        return mask ^ num;
9    }
10}