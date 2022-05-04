/*
Funtion to convert binary to decimal.
 */
import java.util.*;
import java.lang.Math;
public class BinaryToDecimal{
       public static int binaryToDecimal(int binary){
        //    return Integer.parseInt(binary,2); //binary argument must be string.

           int decimal = 0,i=0;
            while(true){
                if(binary<=0){
                    break;
                }else{
                    int temp=binary%10;
                    decimal+=temp*Math.pow(2,i);
                    binary=binary/10;
                    i++;
                }
            }
            return decimal;
       }
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the binary number");
             int n=sc.nextInt();
             System.out.println("The decimal value of "+n+" is: "+binaryToDecimal(n));
        }
}