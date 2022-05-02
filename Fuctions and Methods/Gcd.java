/*
Write a funcion that calculates the Greatest common divisor of 2 numbers.

 */
import java.util.*;
class Gcd{
    public static int gcd(int x, int y){
        int gcd=1;
        if(y==0){
            return x;
        }else if(y>x){
            gcd(y,x);
        }
        for(int i=1;i<=y;i++){
            if(x%i==0 && y%i ==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The GCD of two given numbers is: "+gcd(a,b));
    }
}