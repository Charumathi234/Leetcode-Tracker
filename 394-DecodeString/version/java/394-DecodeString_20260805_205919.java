// Last updated: 8/5/2026, 8:59:19 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> countStack = new Stack<>();
4        Stack<StringBuilder> stringStack = new Stack<>();
5
6        StringBuilder current = new StringBuilder();
7        int num = 0;
8
9        for (char ch : s.toCharArray()) {
10
11            if (Character.isDigit(ch)) {
12                num = num * 10 + (ch - '0');
13            } 
14            else if (ch == '[') {
15                countStack.push(num);
16                stringStack.push(current);
17
18                num = 0;
19                current = new StringBuilder();
20            } 
21            else if (ch == ']') {
22                int repeat = countStack.pop();
23                StringBuilder previous = stringStack.pop();
24
25                while (repeat-- > 0) {
26                    previous.append(current);
27                }
28
29                current = previous;
30            } 
31            else {
32                current.append(ch);
33            }
34        }
35
36        return current.toString();
37    }
38}