class Solution {
    public boolean isPalindrome(int x) {
         if(x<0)
             return false;
         else
         {
             int rev=0;
             int pop=0;
             int temp=x;
             while(x>0)
             {
                 pop=x%10;
                 x/=10;
                 rev=rev*10+pop;
                 
             }
             x=temp;
             if(x==rev)
                 return true;
             else
                 return false;
         }   
    }
}
