// Last updated: 7/9/2026, 3:10:30 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List <List<Integer>> ans = new ArrayList<>();
            if(root == null) return ans;
         Queue <TreeNode> q = new LinkedList<>();
         int x =0;
    
        q.add(root);
        while(q.size()>0){
            List <Integer> temp =new ArrayList<>();
            int m = q.size();
            for(int i=1;i<=m;i++){
               TreeNode curr = q.poll();
                
                    temp.add(curr.val);
                
                if(curr.left!=null){
                  q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(x%2!=0){
                Collections.reverse(temp);

            }
            ans.add(temp);
            x++;
            
            
        }
        return ans;
    }
}