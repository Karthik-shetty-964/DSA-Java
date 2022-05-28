/*
Recursive program to remove all the duplicates present in the string.
for ex: 
abbccda => abcd
*/
import java.util.*;
public class RemoveDuplicate{
    public static int map[]=new int[26];
    public static void removeDuplicate(String old_String,String new_String,int ind) {
        if(ind==old_String.length()){
            System.out.println(new_String);
            return;
        }
        char ch=old_String.charAt(ind);
        if(map[ch-'a']==0){
            new_String+=ch;
            map[ch-'a']=1;
        }
        removeDuplicate(old_String,new_String,ind+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        removeDuplicate("abbbchgfgjhguyffcda","",0);
    }
}