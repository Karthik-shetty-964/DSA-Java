/*
Recursive program to reverse a string.
*/
import java.util.*;
public class StrReverse{
    public static void stringReverse(String str,int len){
        if(len<0){
            return;
        }
        System.out.print(str.charAt(len));
        stringReverse(str,len-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="Nikal loude";
        stringReverse(str,str.length()-1);
    }
}