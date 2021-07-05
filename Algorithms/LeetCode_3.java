class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*String result = "";
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            if(temp.length() > result.length() && temp.contains(Character.toString(s.charAt(i)))){
                result = temp;
                temp = Character.toString(s.charAt(i));
            }
            
            if(!temp.contains(Character.toString(s.charAt(i))))
                temp += s.charAt(i);
            
        }
        if(temp.length() > result.length())
            result = temp;
        
        return result.length();*/
        
        if(s.length() == 0) return 0;
        else if(s.length() == 1) return 1;
        String result = "";
        String temp = "";
        for(int i = 0 ; i < s.length() - 1; i++){
            temp += s.charAt(i);
            for(int j = i + 1; j < s.length() ;j++){
                if(temp.contains(Character.toString(s.charAt(j)))){
                    break;   
                }
                else
                    temp += s.charAt(j);
            }
            if(temp.length() > result.length()){
                result = temp;
                temp = "";
            }
                
            else
                temp = "";
        }
        
        return result.length();
    }
}
