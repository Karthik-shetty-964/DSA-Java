/*
Two dimensional array
Take a matrix as input from the user.Search for given number 'x' and print the indices at which it occurs.
*/
import java.util.*;
public class Search2{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int[][] arr=new int[n][n];
             for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
             }

             System.out.println("Enter the element to be searched");
             int key=sc.nextInt();
             for(int i=0;i<n;i++){
                 for(int j=0;j<n;j++){
                     if(arr[i][j]==key){
                         System.out.println("The searched element "+key+" is present at location: ("+i+","+j+")");
                         System.exit(0);
                     }
                 }
             }
             System.out.println("The searched element "+key+" is not present in the array.");
        }
}