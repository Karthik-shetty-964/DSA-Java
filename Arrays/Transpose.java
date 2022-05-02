/*
For a given matrix of N x M, print its transpose.
1 2 3      1 4 7
4 5 6  =>  2 5 8
7 8 9      3 6 9

*/
import java.util.*;
public class Transpose{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
             int m=sc.nextInt();
             int numbers[][]=new int[n][m];
            System.out.println("Enter the matrix");
             for(int i=0; i<n;i++){
                 for(int j=0;j<m;j++){
                     numbers[i][j]=sc.nextInt();

                 }
             }
             System.out.println("The transpose of the given matrix is:");
             for(int i=0;i<m;i++){
                 for(int j=0;j<n;j++){
                     System.out.print(numbers[j][i]+" ");
                 }
                 System.out.println();
             }
        }
}