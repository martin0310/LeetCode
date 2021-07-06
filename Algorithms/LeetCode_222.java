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
    
    int number = 0;
    
    public int countNodes(TreeNode root) {
        count_number_of_nodes(root);
        return number;
    }
    
    public void count_number_of_nodes(TreeNode root){
        if(root == null) return ;
        if(root != null) number++;
        TreeNode left = root.left;
        TreeNode right = root.right;
        count_number_of_nodes(left);
        count_number_of_nodes(right);
        
    }
}
