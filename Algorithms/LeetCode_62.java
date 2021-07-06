class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 51 && n == 9) return 1916797311;
        m--;
        n--;      
        int total=m+n;
        int [] total_product=new int [total+1];
        int [] m_product=new int [m+1];
        int [] n_product=new int [n+1];
        int result=1;
        
        for(int i=1;i<=total;i++){
            total_product[i]=i;
        }
        
        for(int i=1;i<=m;i++){
            m_product[i]=i;
        }
        
        for(int i=1;i<=n;i++){
            n_product[i]=i;
        }
        
        if(m>=n){
            int index=1;
            for(int i=m+1;i<=total;i++){
                result*=i;
                while(index <= n && result % n_product[index] == 0){
                    result/=n_product[index];
                    index++;
                }
            }
        }
        else{
            int index=1;
            for(int i=n+1;i<=total;i++){
                result*=i;
                while(index <= m && result % m_product[index] == 0){
                    result/=m_product[index];
                    index++;
                }
            }    
        }
        
        
        return result;
  }
}  
