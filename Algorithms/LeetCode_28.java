class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle=="")
            return 0;
        else if(needle.length()>haystack.length())   
            return -1;
        else{
            int haystack_length=haystack.length();
            int needle_length=needle.length();
            int return_index=0;
            int point=0;
            for(int i=0;i<haystack_length;i++){
                
               
                for(int j=0,k=i;j<needle_length;j++,k++){
                   
                   if(k>haystack_length-1){
                        return_index=-1;
                           break;
                   }
                   else if(haystack.charAt(k)==needle.charAt(j) ){
                        return_index=i;
                        point++;
                        if(point==needle_length)
                            return i;
                    }
                    else if((k==haystack_length-1 && point<needle_length) && haystack_length!=needle_length){
                           return_index=-1;
                           break;
                    }
                    else{
                        break;
                    }
                }
                if(point<needle_length){
                    return_index=-1;
                    point=0;
                }
                    
                if(i>haystack_length-needle_length+1){
                    return_index=-1;
                    break;
                }
            }
            
            return return_index;
        }

    }
    }
