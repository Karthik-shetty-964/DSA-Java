/*
Update the 2nd bit(pos=1) of a number to 1. (n=0101)

NOTE:
In case of update bit, 
if update to 1 is same as Set
and update to 0 is same as Clear

*/
import java.util.*;
public class UpdateBit{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int n=5;
             
             System.out.println("Enter the position of the bit to be updated.");
             int pos=sc.nextInt();

             System.out.println("Enter the value (0,1) of the bit for which it has to be updated.");
             int val=sc.nextInt();
             
             int bitMask=1<<pos;

             if(val==1){
                 int res=bitMask | n;
                 System.out.println(res);
             }else{
                 int notBitMask=~(bitMask);
                 int res=notBitMask & n;
                 System.out.println(res);
             }

            

        }
}
