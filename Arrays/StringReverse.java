/*
Program to reverse a string.
*/

import java.util.*;
public class StringReverse{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             String s=sc.nextLine();
             StringBuilder sb=new StringBuilder(s);

             for(int i=0;i<sb.length()/2;i++){
                 int first=i;
                 int last=sb.length()-1-i;

                 char firstOne=sb.charAt(i);
                 char lastOne=sb.charAt(sb.length()-1-i);
                 
                 sb.setCharAt(first,lastOne);
                 sb.setCharAt(last,firstOne);

             }
             System.out.println(sb);
        }
}