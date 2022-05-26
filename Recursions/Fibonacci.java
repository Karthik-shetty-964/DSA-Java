/*
Recursive program to  print the fibonacci sequence till nth term.
*/
import java.util.*;
public class Fibonacci{
    public static void fibonacci(int n,int val1,int val2,int val3){
        if(val3>n){
            return;
        }else{
            System.out.println(val3);
            fibonacci(n,val2,val3,val2+val3);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(0);
        System.out.println(1);
        fibonacci(200,0,1,0+1);//should print fibonacci sequence within 20.
    }
}