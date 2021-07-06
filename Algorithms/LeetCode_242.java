class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
        Boolean bool=true;
        
        int [] s_array=new int[s.length()];
        int [] t_array=new int[t.length()];
        for(int i=0;i<s.length();i++){
            s_array[i]=s.charAt(i)-'a'+1;
            t_array[i]=t.charAt(i)-'a'+1;    
        }
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        for(int i=0;i<s.length();i++){
            if(s_array[i] != t_array[i]){
                bool=false;
                break;
            }
        }
        return bool;
    }
}
