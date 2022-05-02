/*
Print the spiral order matrix as output for a given matrix of numbers. 
1  5  7  8  9  10
6  5  7  8  3  2
9 25  8  8  9  9 
5 55  7  0  9  7

spiral order will be 1 5 7 8 9 10 2 9 7 9 07 55 5 9 6 5 7 8 3 9 8 8 8

 */
import java.util.*;
public class Spiral{
        public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int m=sc.nextInt();
             int numbers[][]=new int[n][m];

             for(int i=0; i<n;i++){
                 for(int j=0;j<m;j++){
                     numbers[i][j]=sc.nextInt();

                 }
             }
             

             int row_start=0;
             int col_start=0;
             int row_end=n-1;
             int col_end=m-1;

             while(row_start<=row_end && col_start<=col_end){
                 for(int col=col_start;col<=col_end;col++){
                     System.out.print(numbers[row_start][col]+" ");
                 }
                 row_start++;

                 for(int row=row_start;row<=row_end;row++){
                     System.out.print(numbers[row][col_end]+" ");
                 }
                 col_end--;

                 for(int col=col_end;col>=col_start;col--){
                     System.out.print(numbers[row_end][col]+" ");
                 }
                 row_end--;
                 for(int row=row_end;row>=row_start;row--){
                     System.out.print(numbers[row][col_start]+" ");
                 }
                 col_start++;

                 
             }
        }
}