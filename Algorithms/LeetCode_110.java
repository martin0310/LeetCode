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
    
    boolean bool = true;
    
    public boolean isBalanced(TreeNode root) {
        int height = cal_height(root);
        
        
        return bool;
    }
    
    public int cal_height(TreeNode node){
        if(bool == false) return 0;
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        
        int left_height = cal_height(node.left);
        int right_height = cal_height(node.right);
        
        if(Math.abs(left_height - right_height) > 1){
            bool = false;
            return 0;
        }
        else
            return Math.max(left_height,right_height) + 1;
    }
}
