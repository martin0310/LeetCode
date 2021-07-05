class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        helper(n,0,new ArrayList<>(),result);
        
        for(List<Integer> temp : result){
            List<String> current = new ArrayList<>();
            
            for(Integer inner : temp){
                char [] ch = new char[n];
                Arrays.fill(ch,'.');
                ch[inner] = 'Q';
                String str= String.valueOf(ch);
                current.add(str);
            }
            ans.add(current);
        }
        
        return ans;
    }
    
    public void helper(int n,int row,List<Integer> row_place,List<List<Integer>> result){
        if(row == n){
            result.add(new ArrayList<>(row_place));
            return ;
        }
        for(int col = 0; col < n; col++){
            row_place.add(col);
            if(isValid(row_place)){
                helper(n,row + 1,row_place,result);
            }
            row_place.remove(row_place.size() - 1);
        }
    }
    
    public boolean isValid(List<Integer> row_place){
        int rowID = row_place.size() - 1;
        for(int i = 0; i < rowID; i++){
            int diff = Math.abs(row_place.get(i) - row_place.get(rowID));
            if(diff == 0 || diff == rowID - i)
                return false;
        }
        
        return true;
    }
}
