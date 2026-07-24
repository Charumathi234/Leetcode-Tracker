// Last updated: 7/24/2026, 10:11:29 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    public String serialize(TreeNode root) {
13        if (root == null) return "null,";
14
15        return root.val + "," +
16               serialize(root.left) +
17               serialize(root.right);
18    }
19
20    public TreeNode deserialize(String data) {
21        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
22        return buildTree(queue);
23    }
24
25    private TreeNode buildTree(Queue<String> queue) {
26        String val = queue.poll();
27
28        if (val.equals("null")) {
29            return null;
30        }
31
32        TreeNode node = new TreeNode(Integer.parseInt(val));
33        node.left = buildTree(queue);
34        node.right = buildTree(queue);
35
36        return node;
37    }
38}
39
40// Your Codec object will be instantiated and called as such:
41// Codec ser = new Codec();
42// Codec deser = new Codec();
43// TreeNode ans = deser.deserialize(ser.serialize(root));