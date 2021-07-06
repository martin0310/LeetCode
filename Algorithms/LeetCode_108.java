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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        
        int middle = nums.length/2;
        TreeNode root = new TreeNode(nums[middle]);
        int left = 0;
        int right = nums.length - 1;
        
        helper_left(nums,left,middle - 1,root);
        helper_right(nums,middle + 1,right,root);
        
        
        return root;
        
    }
    
    public void helper_left(int [] nums,int left,int right,TreeNode root){
        
        
        if(left > right) return ;
        int middle = (left + right) / 2;
        
        
        root.left = new TreeNode(nums[middle]);
        helper_left(nums,left,middle - 1,root.left);
        helper_right(nums,middle + 1,right,root.left);
        
    }
    public void helper_right(int [] nums,int left,int right,TreeNode root){
        if(left > right) return ;
        int middle = (left + right) / 2;
        
        
        root.right = new TreeNode(nums[middle]);
        helper_left(nums,left,middle - 1,root.right);
        helper_right(nums,middle + 1,right,root.right);
    }
}
