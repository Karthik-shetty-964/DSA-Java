/*
Demonstrate the working of packages
In this program we are importing our own package bank.
 */
import bank;
import java.util.*;

public class Package{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             bank.Account a1=new bank.Account();
             a1.name="karthik";
             System.out.println(a1.name);
        }
}