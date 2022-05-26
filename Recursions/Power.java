/*
Recursive program to calculate x^n (Stack height = n)
*/

// import java.util.*;
// public class Power{
//     public static int calcPower(int x,int n){
//         if(x==0){
//             return 0;
//         }
//         if(n==0){
//             return 1;
//         }
//         return x*calcPower(x,n-1);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int res=calcPower(2,0);//calculate x^n
//         System.out.println(res);
//     }
// }




/*
Recursive program to calculate x^n (Stack height = logn)
 */

import java.util.*;
public class Power{
    public static int calcPower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //if n is even
        if(n%2==0){
            return calcPower(x,n/2)*calcPower(x,n/2);
        }else{//if n is odd
            return calcPower(x,n/2)*calcPower(x,n/2)*x;
        }   
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int res=calcPower(2,4);//calculate x^n
        System.out.println(res);
    }
}