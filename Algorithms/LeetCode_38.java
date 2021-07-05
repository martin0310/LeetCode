class Solution {
    public String countAndSay(int n) {
        String output="";
        if(n==1){
            output="1";
        }else{
           String input=countAndSay(n-1)+"0";
           int count=1; 
           for(int i=0;i<input.length()-1;i++){
               if(input.charAt(i)==input.charAt(i+1))
                   count++;
               else{
                   char ch=input.charAt(i);
                   output=output+count+String.valueOf(ch);
                   count=1;
               }
                                             
           } 
        }       
        
        return output;
    }
}
