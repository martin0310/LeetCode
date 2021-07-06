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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
              
        /*int left_depth=minDepth(root.left);
        int right_depth=minDepth(root.right);
        return Math.min(left_depth,right_depth)+1;*/
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int count=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                 
                if(current.left!=null)
                    queue.add(current.left);
                if(current.right!=null)
                    queue.add(current.right);
                if(current.left == null && current.right == null)
                    return count;
            }
            count++;
        }
        return 0;
    }
}
