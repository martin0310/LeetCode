/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> result = new ArrayList<>();
        
        HashMap<Integer,TreeNode> map = new HashMap<>();//<node's val,parent node>
        establish_map(map,root);
        //HashMap<Integer,TreeNode> seen = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> seen = new LinkedList<>();
        int currentlevel = 0;
        //seen.add(target);
        count_level(map ,queue ,target ,K ,currentlevel ,result,seen);
        
        return result;
    }
    
    public void establish_map(HashMap<Integer,TreeNode> map ,TreeNode node ){
        if(node == null) return ;
        if(node.left != null ){
            map.put(node.left.val,node);
        }
        if(node.right != null){
            map.put(node.right.val,node);
        }
        establish_map(map,node.left);
        establish_map(map,node.right);
    }
    
    public void count_level(HashMap<Integer ,TreeNode> map ,Queue<TreeNode> queue ,TreeNode target ,int K ,int currentlevel ,List<Integer> result ,Queue<TreeNode> seen){
        
        if(K == currentlevel) queue.add(target);
        else{
            queue.add(target);
            
            while(!queue.isEmpty()){
            int size = queue.size();
             for(int i = 0; i < size; i++){
                if(K == currentlevel) break;
                TreeNode current = queue.remove();
                seen.add(current);
                if(current.left != null && !seen.contains(current.left)) queue.add(current.left);
                if(current.right != null&& !seen.contains(current.right)) queue.add(current.right);
                if(map.get(current.val) != null && !seen.contains(map.get(current.val))) 
                    queue.add(map.get(current.val)); 
                
             }
                          
            if(K == currentlevel) break;
            currentlevel++;
          }
        }
         
        
        for(TreeNode current: queue){
            if(current != null)
            result.add(current.val);    
        }
        
        
    }
    
}
