class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1)  return ;
        int index = -1;
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i] < nums[i+1])
                index = i;
        }
        if(index == -1){
            for(int i = 0,j = nums.length - 1;i < j;i++ ,j--){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            return ;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = index + 1; i < nums.length; i++){
            if(nums[i] > nums[index])
                list.add(nums[i]);
        }
        
        //if(list.size() == 0) return ;
        int min = list.get(0);
        for(int i = 1 ; i < list.size(); i++){
            int temp = list.get(i);
            if(temp < min){
                min = temp;
            }
        }
        
        
        for(int i = index + 1; i < nums.length; i++){
            if(nums[i] == min){
                if(i != nums.length - 1 && nums[i] == nums[i+1]) continue;
                int temp = nums[index];
                nums[index] =nums[i];
                nums[i] = temp;
                break;
            }        
        }
        
        for(int i = index + 1,j = nums.length - 1;i < j;i++ ,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
