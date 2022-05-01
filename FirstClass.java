import java.util.*;
class FirstClass{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not a prime");
                System.exit(0);
            }
        }
        System.out.println("Is a prime");
    }  
}