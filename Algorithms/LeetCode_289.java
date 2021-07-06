class Solution {
    public void gameOfLife(int[][] board) {
        int [][] temp = new int [board.length + 2][board[0].length + 2];
        for(int [] row : temp){
            Arrays.fill(row,0); 
        }
       
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length;j++){
                temp[i +1][j + 1] = board[i][j];   
            }
        }
        for(int i = 1; i < temp.length - 1;i++){
            for(int j = 1; j < temp[0].length - 1; j++){
                int direction = 1;
                int live = 0;
                while(direction <= 8){
                    switch(direction){
                        
                        case 1:
                            if(temp[i - 1][j] == 1)
                                live++;
                            break;
                        case 2:
                            if(temp[i - 1][j + 1] == 1)
                                live++;
                            break;
                        case 3:
                            if(temp[i][j + 1] == 1)
                                live++;
                            break;
                        case 4:
                            if(temp[i + 1][j + 1] == 1)
                                live++;
                            break;
                        case 5:
                            if(temp[i + 1][j] == 1)
                                live++;
                            break;
                        case 6:
                            if(temp[i + 1][j - 1] == 1)
                                live++;
                            break;
                        case 7:
                            if(temp[i][j - 1] == 1)
                                live++;
                            break;
                        case 8:
                            if(temp[i - 1][j - 1] == 1)
                                live++;
                            break;
                            
                    }
                    direction++;
                                    
                }
                if(board[i -1][j - 1] == 1 && live < 2)
                    board[i -1][j - 1] = 0;
                else if(board[i -1][j - 1] == 1 && (live == 2 || live == 3))
                    board[i -1][j - 1] = 1;
                else if(board[i -1][j - 1] == 1 && live > 3)
                    board[i -1][j - 1] = 0;
                else if(board[i -1][j - 1] == 0 && live == 3)
                    board[i -1][j - 1] = 1;
            }
            
        }
    }
}
