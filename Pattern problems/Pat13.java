/*

    1
   212
  32123   
 4321234
543212345   

 */

 class Pat13{
     public static void main(String[] args){
         int row=5,col=9;
         for(int i=1;i<=row;i++){
             int val=i;
             for(int j=1;j<=row;j++){
                 if(j<=row-i){
                     System.out.print(" ");
                 }else{
                     System.out.print(val);
                     val--;
                 }
             }
            
             for(int j=2;j<=i;j++){
                     System.out.print(j);
             }
             
             System.out.println();
         }
     }
 }