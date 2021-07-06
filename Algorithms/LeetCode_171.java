class Solution {
    public int titleToNumber(String s) {
        int output=0;
        if(s.length() == 0) return output;
        for(int i=s.length()-1;i>=0;i--){
            
            output +=( s.charAt(i)-'A'+1 )*(int)Math.pow(26,s.length()-1-i);
        }
        return output;
    }
}
