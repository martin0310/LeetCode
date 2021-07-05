class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output=new ArrayList<>();
       
        int [] new_nums=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            new_nums[i+1]=nums[i];
        }
        int times=1;
        for(int i=nums.length;i>0;i--){
            times*=i;
        }
        for(int i=0;i<times;i++){
            
            List <Integer> permutation=new ArrayList<Integer>();
            if(i==0){
                for(int j=1;j<new_nums.length;j++){
                permutation.add(new_nums[j]);
             }
             output.add(permutation);
              continue;  
            }
            arr(new_nums);
            for(int j=1;j<new_nums.length;j++){
                permutation.add(new_nums[j]);
            }
            
            output.add(permutation);
            
            
        }
        return output;
    }
    
    
    
    public void arr(int [] new_nums){
         int j=new_nums.length-2;
       while(new_nums[j]>new_nums[j+1])
       {
           j--;
       }      
       int k=new_nums.length-1; 

       while(new_nums[j]>new_nums[k])
       {
           k--;   
       }
       int temp3=0;
       temp3=new_nums[j];
       new_nums[j]=new_nums[k];
       new_nums[k]=temp3;

       int r=new_nums.length-1;
       int s=j+1;

       while(r>s)
       {
           int temp4=0;
           temp4=new_nums[r];
           new_nums[r]=new_nums[s];
           new_nums[s]=temp4;
           r--;
           s++;
       }

       
    }
}
