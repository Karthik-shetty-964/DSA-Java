/* 
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

 */
import java.util.*;
class Fibonacci{
    public static void fibonacci(int n){
        int val1=0,val2=1,val3;
        System.out.println(val1);
        System.out.println(val2);
        for(int i=2;i<n;i++){
            val3=val2+val1;
            val1=val2;
            val2=val3;
            System.out.println(val3);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        fibonacci(n);
    }
}