class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int final_index=nums.length;
        for(int i=0,j=nums.length-1;i<final_index;i++){
            int temp=0;
            if(nums[i]==val){
                count++;
              while(nums[j]==val&&j>=1){
                  j--;
              }
              if(j>i){
                  temp=nums[i];
                  nums[i]=nums[j];
                  nums[j]=temp;  
                  final_index--;
              }  
             
            }
                
        }
        return nums.length-count;
    }
}
