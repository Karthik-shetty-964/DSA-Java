/*
Recursive program to print all the subsets of first n natural numbers.
i,e n=3 , {1,2,3} => 123, 12, 13, 23, 1 ,2 ,3, _
*/

import java.util.*;
public class Subset{
    public static void subsets(int ind,int n,String str){
        if(ind>n){
            System.out.println(str);
            return;
        }
        //to be 
        subsets(ind+1,n,str+ind);
        //not to be
        subsets(ind+1,n,str);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        subsets(1,3,"");
    }
}