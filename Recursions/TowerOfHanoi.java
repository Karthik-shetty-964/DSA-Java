/*
Recursive program to solve tower of hanoi probelm for n disks.
*/

import java.util.*;
public class TowerOfHanoi{
    public static void towerOfHanoi(int disks,String src,String helper,String dest){
        if(disks==0){
            System.out.println("No disks present..");
        }
        if(disks==1){
            System.out.println("Transfer the disk "+disks+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(disks-1,src,dest,helper);
        System.out.println("Transfer the disk "+disks+" from "+src+" to "+dest);
        towerOfHanoi(disks-1,helper,src,dest);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int disks=3;
        towerOfHanoi(disks,"S","H","D");
        System.out.println("Total number of moves taken to transfer "+disks+" disks is: "+(Math.pow(2,disks)-1));
    }
}