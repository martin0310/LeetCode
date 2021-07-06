class Solution {
    public int countPrimes(int n) {
        if(n == 0) return 0;
        if(n == 1) return 0;
        
        int count=0;
        
        for(int i=2;i<=n-1;i++){
            int flag=0;
            if(i == 2){
                count++;
                continue;
            }
            for(int j=2;j*j<=i;j++){
                if(i%j == 0){
                    flag=1;
                    break;
                }
            }
            if(flag == 0)
                count++;
        }
        
        return count;
    }
}
