/*

*      *
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
*      *

*/

class Pat15{
    public static void main(String args[]){
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        //lower half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}