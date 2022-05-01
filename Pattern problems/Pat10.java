/*
    *****
   *****
  *****
 *****
*****

 */

 class Pat10{
     public static void main(String[] args){
         int row=5,col=9;
         for(int i=0;i<row;i++){
             for(int j=0;j<=col-i;j++){
                if(j<col-row-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
             }
             System.out.println();
         }
     }
 }