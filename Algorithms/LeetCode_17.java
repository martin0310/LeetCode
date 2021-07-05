class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;
        String current = "";
        backtrack(0,result,digits,current);
        
        return result;
    }
    
    public void backtrack(int index,List<String> result,String digits,String current){
        if(index == digits.length()-1){
            String number=stringnumber(digits.charAt(index));
            for(int i=0;i<number.length();i++){
                String temp=current;
                current+=number.charAt(i);    
                result.add(current);
                current = temp;
            }
            return ; 
        }
        
        String number=stringnumber(digits.charAt(index));
        for(int i=0;i<number.length();i++){
            String temp=current;
            current+=number.charAt(i);
            backtrack(index+1,result,digits,current);
            current=temp;    
        }
        
        
    }
    
    public String stringnumber(char c){
        String str= "";
        switch(c){
            case '2':
                str = "abc";
                break;
            case '3':
                str = "def";
                break;    
            case '4':
                str = "ghi";
                break;
            case '5':
                str = "jkl";
                break;  
            case '6':
                str = "mno";
                break;   
            case '7':
                str = "pqrs";
                break; 
            case '8':
                str = "tuv";
                break;     
            case '9':
                str = "wxyz";
                break;     
        }
        
        return str;
    }
}
