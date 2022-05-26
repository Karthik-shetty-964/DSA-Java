/*
Recursive program to get the sum of N natural numbers.
 */
import java.util.*;
public class SumNaturalNumbers
{
    public static void sumNatural(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        sumNatural(n-1,sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        sumNatural(5,0);//Should get the sum of first 5 natural numbers.
        
    }
}