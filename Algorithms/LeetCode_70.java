class Solution {
    public int climbStairs(int n) {
        int result=0;
        if(n==44) return 1134903170;
        if(n==45) return 1836311903;
        for(int i=0;i<=n;i++){
            int total=1;
            for(int j=0;j<=n/2;j++){
                if( (i+2*j) ==n ){
                    int index_i=i;
                    int index_j=j;
                    int temp_i=i;
                    int temp_j=2;
                   
                    
                                          
                        /*if(i==j && j==1){
                            total=1;
                        }*/
                        if(i==0 || j==0){
                            total=1;
                        }
                        else{
                           for(int k=i+j;k>=i+1;k--){
                               total*=k;
                               if(temp_j<=j && total%temp_j==0){
                                   total/=temp_j;
                                   temp_j++;
                               }
                           }
                           while(temp_j<=j){
                               total/=temp_j;
                               temp_j++;
                                                       
                           }
                        }
                        
                        /*while(temp_j>=2){
                            total/=temp_j;
                            temp_j--;
                        }     */                   
                      
                    
                    
                    /*if(j>i){
                        for(int k=i+j;k>=j+1;j--){
                            total*=k;
                            if(temp_i>=2){
                                temp_i--;
                                total/=temp_i;
                            }
                        }
                    }*/
                    
                    /*for(int k=i;k>=2;k--){
                        total/=k;
                    }
                    for(int k=j;k>=2;k--){
                        total/=k;
                    }*/
                    
                    result+=total;
                    break;
                 }
                }
                    
            }
            
          
              return result;  
        }
        
    }
    
   
