class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        int count=0;
        while(n != 1){
            int sum=0;             
            while(n != 0){
                sum+=(n%10)*(n%10);
                    n/=10;
            }
            n=sum;
            if(n == 1){
                return true;
                
            }
            count++;
            if(count==6)
                return false;
        }   
        return false;
   }
}
