/*
Recursive program to count total paths in a maze(matrix) to move from (0,0) to (n,m)

*/
import java.util.*;
public class CountPath{
    public static int countTotalPath(int i,int j,int n,int m){  
        if(i==n|| j==m){
            return 0;
        }  
        if(i==n-1 && j==m-1){
            return 1;
        }
        //to downwards
        int downward=countTotalPath(i+1,j,n,m);
        //to right
        int rightward=countTotalPath(i,j+1,n,m);

        return downward+rightward;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=3,m=3;
        int res=countTotalPath(0,0,n,m);
        System.out.println(res);
    }
}