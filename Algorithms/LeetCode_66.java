class Solution {
    public int[] plusOne(int[] digits) {
          digits[digits.length-1]++;
          int carry=0;
          for(int i=digits.length-1;i>=1;i--){
              if(digits[i]>=10){
                  digits[i]%=10;
                  digits[i-1]++;
              }
          }
          if(digits[0]>=10){
              int [] arr=new int[digits.length+1];
              arr[0]=1;
              arr[1]=digits[0]%10;
              for(int i=1;i<digits.length;i++){
                 arr[i+1]=digits[i];
              }
              return arr;
          }       
        return digits;
    }
}
