/*
Find the number of ways in which you can invite 'n' people to your party. Either single or in pairs.
*/
import java.util.*;
public class PartyInvite{
    public static int inviteGuests(int n){
        if(n<=1){
            return 1;
        }
        //Single 
        int single=inviteGuests(n-1);
        //pairs
        int pairs=(n-1)*inviteGuests(n-2);

        return single+pairs;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=4;
        System.out.println(inviteGuests(n));
    }
}
