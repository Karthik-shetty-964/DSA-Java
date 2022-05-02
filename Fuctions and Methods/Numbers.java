/**
Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

 */
import java.util.*;
 class Numbers{
     public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         System.out.println("Start entering the numbers.Enter any character to stop.");
         int pos=0,neg=0,zero=0;
         while(true){
             try{

              int n=sc.nextInt();
              if(n>0){
                 pos++;
              }else if(n<0){
                neg++;
              }else if(n==0){
                zero++;
              }
             }
             catch(Exception e){

                System.out.println("Invalid number.Terminating..");
                break;
                }
         }
         System.out.println("Positive: "+pos+"\tNegative: "+neg+"\tZeroes: "+zero);
     }
 }