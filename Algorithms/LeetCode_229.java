class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        if(nums.length == 0) return list;
        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        } 
        Arrays.sort(nums);
       
        int ans=0;
        
         for(int i=0;i<nums.length-1;i++){
            ans++;
            if(nums[i] == nums[i+1] ){
                continue;
            }else if(nums[i] != nums[i+1] && ans > nums.length/3){
                list.add(nums[i]);
                ans=0;
            }else if(nums[i] != nums[i+1] && ans<=nums.length/3){
                ans=0;
            }
        }
        
        if(nums[nums.length-1] == nums[nums.length-2]){
            ans++;
            if(ans > nums.length/3)
                list.add(nums[nums.length-1]);
        }else if(nums[nums.length-1] != nums[nums.length-2]){
            ans=0;
            ans++;
            if(ans >nums.length/3 )
                list.add(nums[nums.length-1]);
        }
        
        return list;
    }
}
