class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = i + 1;
        }
        helper(n,k,0,0,arr,new ArrayList<>(),result);
        
        return result;
    }
    
    public void helper(int n,int k,int count,int index,int [] arr,List<Integer> temp,List<List<Integer>> result){
        if(count == k){
            result.add(new ArrayList<>(temp));
            return ;
        }
        else if(n - index < k - count)
            return ;
        for(int i = index; i < arr.length; i++){
            temp.add(arr[i]);
            helper(n,k,count + 1,i + 1,arr,temp,result);
            temp.remove(temp.size() - 1);
        }
    }
}
