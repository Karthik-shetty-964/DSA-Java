/*
Recursive program to print all the permutations of the string.

i.e "abc" => abc,acb,bac,bca,cab,cba
*/
import java.util.*;
public class Pemutation{
    public static void printPermutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            String nstr=str.substring(0,i)+str.substring(i+1);
            printPermutation(nstr,permutation+c);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        printPermutation("abcd","");
    }
}