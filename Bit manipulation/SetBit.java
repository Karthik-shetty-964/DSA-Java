/*
Set the second bit (pos=1) of number n (n=0101)

 */
import java.util.*;
public class SetBit{
       public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=5; // 0101 
            int pos=1; 

            int bitMask=1<<pos;

            int res=bitMask | n;
            System.out.println(res);
        }
}