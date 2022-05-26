/*
Recursive program to print from 5 to 1
 */
import java.util.*;
public class PrintNumbers{
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        printNumbers(5);
    }
}