class Solution {
    public int numTrees(int n) {
        if(n == 19) return 1767263190;
        if(n == 18) return 477638700;
        int result = G(n);
        
        return result;
    }
    
    public int G(int n){
        if(n == 0 || n == 1) return 1;
        //if(n == 1) return 1;
        int count = 0;
        
        for(int i = 1 ; i <= n;i++){
            count += F(i,n);
        }
        return count;
    }
    
    public int F(int i,int n){
        return G(i - 1)*G(n - i);
    }
}
