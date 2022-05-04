/*
Program to convert decimal number to Binary.
 */
 import java.util.*;
 public class DecimalToBinary{
        public static String decimalToBinary(int decimal){
            // return Integer.toBinaryString(decimal);
            int i=0;
            String str="";
            while(decimal>0){
                str+=decimal%2;
                decimal/=2;
            }
            return str;
        }

        public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the decimal number:");
              int n=sc.nextInt();

              System.out.println("The binary value of "+n+" is: "+decimalToBinary(n));
         }
 }