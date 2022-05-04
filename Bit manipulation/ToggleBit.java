/*
Program to toggle a bit in position "pos" in a number n.
 */
import java.util.*;
public class ToggleBit{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a number");
             int n=sc.nextInt();

             System.out.println("Enter a position to toggle the bit.");
             int pos=sc.nextInt();

             int bitMask=1<<pos;
             if((bitMask & n)==0){
                 int res=bitMask | n;
                 System.out.println("After Toggle : "+res);
             }else{
                 int notBitMask=~(bitMask);
                 int res=notBitMask & n;
                 System.out.println("After Toggle : "+res);
             }

        }
}