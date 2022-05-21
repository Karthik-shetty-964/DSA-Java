/*
Program to convert decimal number to Binary.
 */
 import java.util.*;
 public class DecimalToBinary{
        public static StringBuilder decimalToBinary(int decimal){
            // return Integer.toBinaryString(decimal);
            
            int i=0;
            StringBuilder sb=new StringBuilder("");
            while(decimal>0){
                int rem=decimal%2;
                sb.insert(0,rem);
                decimal/=2;
            }
            return sb;
        }

        public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the decimal number:");
              int n=sc.nextInt();

              System.out.println("The binary value of "+n+" is: "+decimalToBinary(n));
         }
 }