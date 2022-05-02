/*
Take 3 numbers as input from the user and find their average

 */
import java.util.*;
 class Average{

     public static double findAvg(int a,int b,int c){
         return (a+b+c)/3;
     }

     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();

         System.out.println("The average of three numbers is: "+findAvg(a,b,c));
     }
 }