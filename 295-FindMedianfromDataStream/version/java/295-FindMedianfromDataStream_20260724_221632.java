// Last updated: 7/24/2026, 10:16:32 PM
1class Solution {
2    public boolean isValidSerialization(String preorder) {
3        String[] nodes = preorder.split(",");
4        int slots = 1;
5
6        for (String node : nodes) {
7            if (slots == 0) return false;
8
9            slots--;
10
11            if (!node.equals("#")) {
12                slots += 2;
13            }
14        }
15
16        return slots == 0;
17    }
18}