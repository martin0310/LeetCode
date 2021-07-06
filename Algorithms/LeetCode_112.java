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
    
    boolean result = false;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        helper(root,targetSum,0);
       
        return result;
    }
    
    public void helper(TreeNode node,int targetSum,int currentSum){
        if(node == null) return ;
        currentSum += node.val;
        if(currentSum == targetSum && node.left == null && node.right == null){
            result = true;
            return ;
        }
        helper(node.left,targetSum,currentSum);
        helper(node.right,targetSum,currentSum);
    }
   
}
