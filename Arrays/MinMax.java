/*
Find the maximum and the minimum number present in the array of integers.
*/

import java.util.*;
public class MinMax{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr={-1,2,343,-333,9,0,3434,134};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("MAX= "+max+" MIN= "+min);
    }
}
