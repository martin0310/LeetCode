class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] new_array = new int [nums1.length + nums2.length] ;
        int index = 0;
        for(int i = 0; i < nums1.length; i++){
            new_array[i] = nums1[i];
            index++;
        }
        int nums2_index = 0;
        for(int j = index; j<new_array.length; j++){
            new_array[j] = nums2[nums2_index];
            nums2_index++;
        }
        Arrays.sort(new_array);
        int median_index = (new_array.length-1)/2;
        double median = 0.0;
        if((new_array.length - 1) % 2 != 0){
            Double d1 = Double.valueOf(new_array[median_index]);
            Double d2 = Double.valueOf(new_array[median_index + 1]);
            median = (d1 + d2) / 2;
        }
            
        else
            median = Double.valueOf(new_array[median_index]);
        
        return median;
    }
}
