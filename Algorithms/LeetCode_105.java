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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return helper(0,0,inorder.length - 1,preorder,inorder);
    }
    
    public TreeNode helper(int prestart,int inStart,int inEnd,int[] preorder, int[] inorder){
        if(prestart > inorder.length - 1 || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(root.val == inorder[i])
                index = i;
        }
        
        root.left = helper(prestart + 1,inStart,index - 1,preorder,inorder);
        root.right = helper(prestart + 1 + index - inStart,index + 1, inEnd,preorder,inorder);
        
        return root;
        
    }
}
