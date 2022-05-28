/*
Recursive program to find all the subsequences of the string.
for ex:
     "abc"  => abc
                ab
                bc
                ac
                a
                b
                c
                _
*/
// import java.util.*;
// public class Subsequences{
//     public static void subsequences(String old_String,int ind,String new_String){
//         if(ind==old_String.length()){
//             System.out.println(new_String);
//             return;
//         }
//         char c=old_String.charAt(ind);
//         //to be 
//         subsequences(old_String,ind+1,new_String+c);
//         //not to be 
//         subsequences(old_String,ind+1,new_String);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         subsequences("aaa",0,"");
//     }
// }




/*
Recursive program to find all the unique subsequences of the string.

for ex:The above program will give us this input.
     "aaa"  => aaa
                aa
                aa
                aa
                a
                a
                a
                _
but, we are supposed to find only unique subsequences.
i.e    "aaa" => aaa
                aa
                a
                -    
*/
import java.util.*;
public class Subsequences{
    public static void subsequences(String old_String,int ind,String new_String,HashSet<String> set){
        if(ind==old_String.length()){
            if(set.contains(new_String)){
                return;
            }else{
                set.add(new_String);
                System.out.println(new_String);
                return;
            }
        }
        char ch=old_String.charAt(ind);
        //to be
        subsequences(old_String,ind+1,new_String+ch,set);
        //not to be
        subsequences(old_String,ind+1,new_String,set);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        subsequences("aaa",0,"",set);
    }
}