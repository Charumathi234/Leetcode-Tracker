// Last updated: 8/28/2026, 9:40:24 AM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> stack = new Stack<>();
4
5        for (String op : operations) {
6            if (op.equals("+")) {
7                int first = stack.pop();
8                int second = stack.peek();
9                stack.push(first);
10                stack.push(first + second);
11            } else if (op.equals("D")) {
12                stack.push(2 * stack.peek());
13            } else if (op.equals("C")) {
14                stack.pop();
15            } else {
16                stack.push(Integer.parseInt(op));
17            }
18        }
19
20        int sum = 0;
21        while (!stack.isEmpty()) {
22            sum += stack.pop();
23        }
24
25        return sum;
26    }
27}