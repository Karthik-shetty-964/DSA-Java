/* write a program to count the total number of 1 bits in the given number.*/
import java.util.*;
class CountBit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int [] binary=new int[20];
        int i=0,count=0;
        while(n>0){
            binary[i++]=n%2;
            n=n/2;
        }
        for(int j=0;j<binary.length;j++){
            if(binary[j]==1){
                count++;
            }
        }
        System.out.println("Total number of 1's in n is: "+count);
    }
}