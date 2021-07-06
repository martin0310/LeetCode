class Solution {
    public int mySqrt(int x) {
        int result=0;   
        for(int i=1;i*i<=x;i++){
            
            result=i;
            if(i==46340){
                result=i;
                break;
            }
        }
       
        return result;
    }
}
