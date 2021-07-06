class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList <String> list=new ArrayList<>();
        if(nums.length == 0) return list;
        String temp="";
        // temp+=Integer.toString(nums[0]);
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(i == nums.length-1) break;
            if(nums[i]+1 == nums[i+1])
                continue;
            else if(nums[i]+1 != nums[i+1]){
                temp+=Integer.toString(nums[index]);
                temp+="->";
                temp+=Integer.toString(nums[i]);
                if(nums[index] == nums[i])
                    temp=Integer.toString(nums[index]);
                list.add(temp);
                temp="";
                index=i+1;
            }
        }
         temp+=Integer.toString(nums[index]);
         temp+="->";
         temp+=Integer.toString(nums[nums.length-1]);
         if(nums[index] == nums[nums.length-1])
            temp=Integer.toString(nums[index]);
         list.add(temp);
        return list;
    }
}
