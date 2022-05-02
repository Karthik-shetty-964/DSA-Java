/*program to search an element in the array */


import java.util.*;
 
public class Search {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];
 
       for(int i=0; i<size; i++) {
           arr[i] = sc.nextInt();
       }
       System.out.println("Enter the elements to be searched");
       int key=sc.nextInt();
       //print the numbers in array
       for(int i=0; i<arr.length; i++) {
           if(arr[i]==key){
               System.out.println("The number "+key+" is present in the index "+i);
               System.exit(0);
           }
       }
       System.out.println("The number is not present in the array");
   }
}
