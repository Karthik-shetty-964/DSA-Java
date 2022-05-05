/*
   Selection sort algorithm.
   NOTE: The time complexity of the Selection sort will be n^2.
*/
import java.util.*;
public class SelectionSort{
       public static void printArray(int arr[]){
           for(int i=0; i<arr.length; i++){
               System.out.print(arr[i]+" ");
           }
       }
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);

            int arr[]={7,8,3,1,2};

            //Selection sort
            for(int i=0;i<arr.length-1;i++){
                int smallest=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[smallest]){
                        smallest=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[smallest];
                arr[smallest]=temp;
            }

            printArray(arr);
        }
}