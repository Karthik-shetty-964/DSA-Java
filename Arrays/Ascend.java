/*
Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.

*/

public class Ascend {
    public static void main(String[] args) {
        int[] arr={1,2,4,7};    //It is in ascending order
        // int[] arr={3,4,6,2}; //Not in ascending order

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i+1]<arr[i]){
                System.out.println("Not in ascending order");
                System.exit(0);
            }
        }
        System.out.println("Array is in ascending order");

    }   
}
