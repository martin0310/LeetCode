class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1) break;
            if(arr[i] == 0){
                int index=i+1;
                for(int j=arr.length-1;j>index;j--){
                    arr[j]=arr[j-1];
                }
                arr[index]=0;
                i++;
            }
        }
    }
}
