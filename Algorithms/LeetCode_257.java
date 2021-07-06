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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;
        
        String str = "" ;
        count_paths(list,root,str,root);
        
        return list;
    }
    
    
    public void count_paths(List<String> list,TreeNode node,String str,TreeNode root){
        if(root == null) return ;
        if(node == null) return ;
        if(node.left == null && node.right == null){
            str = root.val + str;
            list.add(str);
            return ;
        }
        
        String str_left = str;
        String str_right = str;
        
        if(node.left != null){
            str_left =  str + "->" + node.left.val ;        
        }
        count_paths(list,node.left,str_left,root);        
        
        
        if(node.right != null){
            str_right =   str + "->" + node.right.val ;
        }
        count_paths(list,node.right,str_right,root);
        
        
                
    } 
    
}
