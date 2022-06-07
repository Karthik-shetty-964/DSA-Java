/*
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.

Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]

Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
*/
import java.util.*;
public class Sudoku{
    public static boolean isSafe(char[][] board,int row,int col,int val){
        //horizotal and vertical 
        for(int i=0;i<board.length;i++){
            if(board[row][i]==(char)(val+'0')){
                return false;
            }
            if(board[i][col]==(char)(val+'0')){
                return false;
            }
        }
        //grid
        int rs=(row/3)*3;
        int cs=(col/3)*3;
        for(int r=rs;r<rs+3;r++){
            for(int c=cs;c<cs+3;c++){
                if(board[r][c]==(char)(val+'0')){
                    return false;                    
                }
            }
        }
       return true; 
    }
    public static boolean helper(char [][] board,int row,int col){
        if(row==board.length){
            return true;
        }
        int nrow=0;
        int ncol=0;
        if(col!=board.length-1){
             nrow=row;
             ncol=col+1;
        }else{
             nrow=row+1;
             ncol=0;
        }
        if(board[row][col]!='.'){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }else{
             for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board,nrow,ncol)){
                        return true;
                    }else{
                        board[row][col]='.';
                    }
                   
                }
            }
        }
        return false;
    }
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char [][] board={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        
        helper(board,0,0);

        //print Output
        for(int i=0;i<board.length;i++){
            System.out.print("[");
            for(int j=0;j<board.length;j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}