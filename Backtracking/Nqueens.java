/*
There is N*N board with N queens 
we need to print all the possible solutions in which the queens can be placed where all the are safe.
(Only fucntion to solve the problem is written.Main function is not written)
*/
import java.util.*;
public class Nqueens{

    public static boolean isSafe(int row,int col,char[][] board){
        //This function returns true only if the queen can be placed safely.

        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        } 

        //upper left diagonal
        int r= row;
        for(int c=col; r>=0 && c>=0; r--,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        // upper right diagonal
        r=row;
        for(int c=col; r>=0 && c<board.length; r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        // lower left diagonal
        r=row;
        for(int c=col; r<board.length && c>=0; r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        
        // lower right diagonal
        r=row;
        for(int c=col; r<board.length && c<board.length; r++,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true; 

    }

    public static void saveBoard(char [][] board,List<List<String>> allBoard){
        String row="";
        List<String> newBoard=new ArrayList<String>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }


    public static void helper(char [][] board,List<List<String>> allBoard,int col){
        if(col==board.length){
            //This saves the board into list of boards
            saveBoard(board,allBoard);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoard,col+1);
                board[row][col]='.';
            }
        }
    }


    public static List<List<String>> printBoard(int n){
        //This function returns the list of boards in which all the queens all placed safely.
        List<List<String>> allBoard=new ArrayList<>();
        char [][] board=new char[n][n];

        //This is a recursive fucntion to check all the possible positions where the queens can be placed.
        helper(board,allBoard,0);

        return allBoard;
    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Enter the number of queens [if n=4 then board will be n*n]
        int n=4;

        System.out.println(printBoard(n));
    }
}