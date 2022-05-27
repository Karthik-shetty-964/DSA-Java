/*
Recursive program to check if the array is sorted or not.
(Returns true only if the array is Strictly increasing. i.e The current element and next element must be in increasing order.It can not even be equal.)
i.e {1,2,3,4,5} => true
    {1,2,3,4,4} => false
    {5,4,3,2,1} => false
*/
import java.util.*;
public class IsSorted{
    
    public static void isSorted(int [] arr,int ind){
        if(ind==arr.length-1){
            System.out.println("true");
            return;
        }
        if(arr[ind]>=arr[ind+1]){
            System.out.println("false");
            return;
        }else{
            isSorted(arr,ind+1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,4};
        isSorted(arr,0);
    }
}