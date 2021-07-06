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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        return helper(inorder,postorder,0,inorder.length - 1,inorder.length - 1);
    }
    
    private TreeNode helper(int [] inorder,int [] postorder,int inStart,int inEnd,int postEnd){
        if(inStart > inEnd || postEnd < 0) return null;
        
        TreeNode node = new TreeNode(postorder[postEnd]);
        int index = 0;
        
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == node.val){
                index = i;
                break;
            }       
        }
        
        node.left = helper(inorder,postorder,inStart,index - 1,postEnd - 1 - inEnd + index);
        node.right = helper(inorder,postorder,index + 1,inEnd,postEnd - 1);
        
        return node;
    }
}
