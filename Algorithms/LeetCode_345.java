class Solution {
    public String reverseVowels(String s) {
        if(s.length() == 0) return "";
         char[] a = s.toCharArray(); 
         String output="";
         Set<Character> vowels=new HashSet<>();
         vowels.add('A');
         vowels.add('a');
         vowels.add('E');
         vowels.add('e');
         vowels.add('I');
         vowels.add('i');
         vowels.add('O');
         vowels.add('o');
         vowels.add('U');
         vowels.add('u');
        for(int i=0,j=a.length-1;j>i;){
            if(vowels.contains(a[i]) && vowels.contains(a[j])){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }else if(!vowels.contains(a[i]) || vowels.contains(a[j])){
                i++;
            }else if(vowels.contains(a[i]) || !vowels.contains(a[j])){
                j--;
            }else{
                i++;
                j--;
            }
        }
        
        
        for(int i=0;i<a.length;i++){
            output+=Character.toString(a[i]);
        }
        return output;
    }
}
