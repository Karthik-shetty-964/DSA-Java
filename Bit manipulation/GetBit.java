/*
Get the 3rd bit (pos=2) of a number n=0101.
*/
import java.util.*;
public class GetBit{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int n=5;// 0101
             int pos=0;

             int bitMask=1<<pos;

             if((bitMask & n)==0){
                 System.out.println("The bit is zero");
             }else{
                 System.out.println("The bit is one");
             }
        }
}