class Solution {
    public int findLucky(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        
        int [] count = new int [max + 1];
        Arrays.fill(count,0);
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int frequency = -1;
        for(int i = 1; i < count.length; i++){
            if(count[i] == i)
                frequency = i;
        }
        return frequency;
    }
}
