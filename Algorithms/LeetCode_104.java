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
    public int answer=0;
    public int maxDepth(TreeNode root) {
        int depth=1;
        TreeNode node=root;
        maximum_depth(node,depth);
        return answer; 
    }
    
    public void maximum_depth(TreeNode node,int depth){
          if(node==null) return;        
          if(node.left==null && node.right==null)
              answer=Math.max(answer,depth);
          
          maximum_depth(node.left,depth+1);
          maximum_depth(node.right,depth+1);
    }
}
