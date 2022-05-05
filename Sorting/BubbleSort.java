/*
   Bubble sort algorithm.
   NOTE: The time complexity of the bubble sort will be n^2.
*/
import java.util.*;
public class BubbleSort{
       public static void printArray(int arr[]){
           for(int i=0; i<arr.length; i++){
               System.out.print(arr[i]+" ");
           }
       }
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);

            int arr[]={7,8,3,1,2};

            //bubble sort
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }

            printArray(arr);
        }
}