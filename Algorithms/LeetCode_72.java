class Solution {
    public int minDistance(String word1, String word2) {
        int [][] arr = new int [word2.length() + 1][word1.length() + 1];
        for(int i = 0; i < arr[0].length; i++){
            arr[0][i] = i;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i][0] = i;
        }
        
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[i].length; j++){
                if(word1.charAt(j - 1) == word2.charAt(i - 1))
                    arr[i][j] = arr[i - 1][j - 1];
                else{
                    int first_compare = Math.min(arr[i][j - 1],arr[i - 1][j - 1]);
                    int second_compare = Math.min(arr[i - 1][j - 1],arr[i - 1][j]);
                    int last = Math.min(first_compare,second_compare);
                    arr[i][j] = last + 1;
                }
            }
        }
        
        return arr[word2.length()][word1.length()];
    }
}
