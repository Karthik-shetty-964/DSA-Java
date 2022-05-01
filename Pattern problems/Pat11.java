/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */

 class Pat11{
     public static void main(String args[]){
         int n=5,val=1;
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(j<n-1-i){
                     System.out.print(" ");
                 }else{
                     System.out.print(val+" ");
                 }
             }
             val++;
             System.out.println();
         }
     }
 }