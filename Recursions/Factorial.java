/*
Recursive program to get the factorial of a number.
*/
import java.util.*;
public class Factorial{
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=fact(5);
        System.out.println(n);
    }
}