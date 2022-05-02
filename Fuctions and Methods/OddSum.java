/*
Write a funtion to print the sum of all odd numbers from 1 to n
 */
import java.util.*;
 class OddSum{
     public static int oddSum(int n){
         int sum=0;
         for(int i=0;i<=n;i++){
             if(i%2!=0){
                 sum+=i;
             }
         }
         return sum;
     }
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);

         int n=sc.nextInt();
         System.out.println("The sum of all odd numbers from 1 to n is: "+oddSum(n));
     }
 }