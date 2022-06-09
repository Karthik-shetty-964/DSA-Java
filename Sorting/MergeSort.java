/*
Program to sort the give array using merge sort.
Time complexity : O(nlogn)
i.e logn to divide the array 
    n to combine the array.
    which is nlogn
 */
import java.util.*;
public class MergeSort{
    public static void conquer(int arr[],int si,int mid,int ei){

        int merging[]=new int[ei-si+1];
        int ind1=si;
        int ind2=mid+1;
        int x=0;

        while(ind1<=mid && ind2<=ei){
            if(arr[ind1]<arr[ind2]){
                merging[x++]=arr[ind1++];
            }else{
                merging[x++]=arr[ind2++];
            }
        }

        while(ind1<=mid){
            merging[x++]=arr[ind1++];
        }
        while(ind2<=ei){
            merging[x++]=arr[ind2++];
        }

        //copy the contents of merging array to original array
        for(int i=0,j=si;i<merging.length;i++,j++){
            arr[j]=merging[i];
        }

    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid =si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={6,3,4,5,1,2};
        int n=arr.length;

        divide(arr,0,n-1);

        for(int i=0;i<arr.length;i++){    
                System.out.print(arr[i]+" ");
            
        }
    }
}