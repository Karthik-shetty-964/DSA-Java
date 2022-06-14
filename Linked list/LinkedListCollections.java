/*
Using collection framework for linked list.
*/
import java.util.*;
public class LinkedListCollections{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<Integer>();

        //add element
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        System.out.println(list);

        list.addLast(40);
        list.add(50);
        System.out.println(list);

        //delete element
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        
        //size
        System.out.println(list.size());


        //iterate over the list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("Null");
    }
}