/*
1 1 1 1
 2 2 2
  3 3
   4
 */

 class Pat17{
     public static void main(String[] args){
         int n=5,val=1;
         for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
            }
            System.out.println();
            val++;
         }
     }
 }