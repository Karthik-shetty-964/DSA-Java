/*
Recursive program to Place tiles of size 1*m  in a floor of n*m.
*/
import java.util.*;
public class TilePlacement{
    public static int tilePlacement(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //if vertically
        int vertical=tilePlacement(n-m,m);
        //if horizontal
        int horizontal=tilePlacement(n-1,m);

        return vertical+horizontal;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=4,m=2;
        int res=tilePlacement(n,m);
        System.out.println(res);
    }
}