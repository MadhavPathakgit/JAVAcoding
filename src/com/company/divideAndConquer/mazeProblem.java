package com.company.divideAndConquer;

public class mazeProblem {
    public static void main( String[] args ) {
        int n= 4;
        boolean[][] board = new boolean[n][n];
        System.out.println( nQueen( board,0 ));

    }
    public static int nQueen(boolean[][] board, int row){
        if(row== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count= 0;
        for(int col=0;col< board.length;col++){
            // place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count += nQueen( board,row+1 );
                board[row][col]= false;

            }
        }
        return count;
    }
    public static boolean isSafe(boolean[][] board,int row, int col){
        // for vertical row
        for(int i = 0;i< row;i++){
            if(board[i][col]){
                return false;
            }
        }
        // for left diagonal;
        int maxLeft = Math.min(row,col);
        for(int i = 1;i<=maxLeft;i++) {
            if ( board[ row - i ][ col - i ] ) {
                return false;
            }
        }
            // for diagonal right
            int maxRight = Math.min(row, board.length-col-1 );

            for(int i = 1;i<=maxRight;i++){
                if(board[row-i][col+i]){
                    return false;
                }

        }
            return true;

    }
    public static void display(boolean[][] boards){
        for(boolean[] row:boards){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");

                }
                else{
                    System.out.print("X ");
                }

            }
            System.out.println();
        }


    }

}