class Solution {
    public String addBinary(String a, String b) {
        int difference=Math.abs(a.length()-b.length());
        if(a.length()>b.length()){
            for(int i=0;i<difference;i++){
                b="0"+b;
            }
        }else if(b.length()>a.length()){
            for(int i=0;i<difference;i++){
                a="0"+a;
            }
        }
        int len=a.length();
        int carry=0;
        String result="";
        for(int i=len-1;i>=0;i--){
            if( (Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry) ==1 ){
                result="1"+result;
                carry=0;
            }else if((Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry) ==2){
                result="0"+result;
                carry=1;
            }else if((Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry) ==3  ){
                result="1"+result;
                carry=1;
            }
            else if((            Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry) ==0              ){
            result="0"+result;            
            carry=0;
        }
        } 
                        
                           
        if(carry==1)
            result="1"+result;
        
        return result;
    }
}
