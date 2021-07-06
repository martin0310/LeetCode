class Solution {
    public void reverseString(char[] s) {
        char temp='a';
        for(int i=0;i<s.length;i++){
            if(i > s.length/2-1) break;
            temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
}
