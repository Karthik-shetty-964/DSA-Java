/*
Clear the 3rd bit (pos=2) of a number n.(n=0101)
 */
 import java.util.*;
 public class ClearBit{
        public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              int n=5;//0101

              int pos=2;

              int bitMask=1<<pos;
              int notbitMask=~(bitMask);

              int res=notbitMask & n;
              System.out.println(res);
         }
 }