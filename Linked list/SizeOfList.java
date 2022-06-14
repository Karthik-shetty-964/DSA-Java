/*
 Get the size of the linked list
*/
import java.util.*;
public class SizeOfList{
    Node head=null;
    private int size;

    SizeOfList(){
        this.size=0;
    }
    //Node definition
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next=null;
            size++;
        }
    }

    //add node at the end of the list 
    public void add(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        
        Node curNode=head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;       
    }

    //delete node from the begining
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete node from the last
    public void deleteLast(){
        if(head== null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=lastNode;
            lastNode=lastNode.next;
        }

        secondLast.next=null;
    }

    //size of the linked List
    public int getSize(){
        return this.size;
    }

    //print list 
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return ;
        }
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+" -> ");
            curNode=curNode.next;
        }
        System.out.println("NULL");

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        SizeOfList list=new SizeOfList();
        list.printList();
       
        list.add("10");
        list.add("20");
        list.add("30");
        list.printList();
        System.out.println(list.getSize());

        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());

        list.deleteLast();
        list.printList();
        
        System.out.println(list.getSize());
        list.add("40");
        System.out.println(list.getSize());

    }
}