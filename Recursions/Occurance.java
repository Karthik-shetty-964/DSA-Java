/*
Recursive program to find the first and last occurance of a character in the string.
*/

import java.util.*;
public class Occurance{
    public static int first=-1;
    public static int last=-1;

    public static void occuranceOfCharacter(String str,char ch,int index){
        if(index==str.length()){
            System.out.println("First Occurance of "+ch+" is at: "+first+" index.");
            System.out.println("Last Occurance of "+ch+" is at: "+last+" index.");
            return;
        }
        if(str.charAt(index)==ch){
            if(first==-1){
                first=index;
            }else{
                last=index;
            }
        }
        occuranceOfCharacter(str,ch,index+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="karthik";
        char c='k';
        occuranceOfCharacter(str,c,0);

    }
}