class Solution {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0) 
            return ;
        solve(board);
    }
    
    public boolean solve(char[][] board) {
       for (int i=0; i<board[0].length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if(board[i][j] == '.'){
                    
                    for(char c ='1'; c<='9'; c++){
                        if(isValidSudoku(board,i,j,c)){
                            board[i][j] =c;
                            if(solve(board)) 
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
       }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board, int row, int col,  char val){
  
        // check row & col
        for(int i=0; i<9; i++) {
            if(board[row][i]==val && i!=col) return false;
            if(board[i][col]==val && i!=row) return false;
        }
        
        //check 3x3 box
        int irow0 = row/3*3;
        int icol0 = col/3*3;
        for(int i=irow0; i<irow0+3; i++) {
            for(int j=icol0; j<icol0+3; j++) {
                if(board[i][j]==val && (i!=row || j!=col)) 
                    return false;
            }
        }
        
        return true;
    }
}