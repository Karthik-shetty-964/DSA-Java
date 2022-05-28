/*
Recursive prorgram to  Move all 'X' to the end of the string.

*/
import java.util.*;
public class MoveX{
    public static String new_String="";
    public static void moveXToEnd(String old,int count, int ind){
        if(ind==old.length()){
            for(int i=0;i<count;i++){
                new_String+="x";
            }
            System.out.println(new_String);
            return;
        }
        if(old.charAt(ind)=='x'){
            count++;
        }else{
            new_String+=old.charAt(ind);
        }
        moveXToEnd(old,count,ind+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        moveXToEnd("axbxcxxd",0,0);
    }
}