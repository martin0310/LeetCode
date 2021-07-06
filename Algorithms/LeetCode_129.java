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
    
    int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        helper(root,"");
        return sum;
    }
    
    public void helper(TreeNode node,String str){
        if(node == null) return ;
        if(node.left == null && node.right == null){
            str += String.valueOf(node.val);
            sum += Integer.parseInt(str);
            return ;
        }
        
        str += String.valueOf(node.val);
        helper(node.left,str);
        helper(node.right,str);
    }
        
}
