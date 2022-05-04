/*
Program to check whether the given number is power of 2 or not.
 */
import java.util.*;
public class PowerOf2{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number");
             int n1=sc.nextInt();
             int n=n1;
             if(n%2!=0){
                 System.out.println(n1+" is not a power of 2");
                 System.exit(0);
             }else{
                 while(n!=2){
                     n=n/2;
                     if(n%2!=0){
                         System.out.println(n1+" is not a power of 2");
                         System.exit(0);
                     }
                 }
             }
             System.out.println(n1+" is a power of 2.");
        }
}