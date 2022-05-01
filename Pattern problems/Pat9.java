/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

// class Pat9{
//     public static void main(String[] args){
//         int n=5,val=1;
//         for(int i=0; i<n; i++){
//                if(i%2==0){
//                     val=1; 
//                 }else{
//                      val=0;
//                 }
//             for(int j=0;j<=i;j++){
//                System.out.print(val+" "); 
//                if(val==0){
//                        val=1;
//                }else{
//                        val=0;
//               }
//             }
//             System.out.println();
//         }
//     }
// }


//    OR


class Pat9{
    public static void main(String [] args){
        int n=5;
        for(int i=0; i<n;i++){
            for(int j=0; j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}