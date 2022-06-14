/*
 Program to add nodes at the begining and end of the linked list.
*/
import java.util.*;
public class addNodes{
    Node head=null;
    //Node definition
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next=null;
        }
    }

    //add node at the begining 
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    //add node at the end of the list 
    public void addLast(String data){
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

        addNodes list=new addNodes();
        list.printList();
       
        list.addFirst("c");
        list.addFirst("b");
        list.printList();

        list.addFirst("a");
        list.printList();
    
        list.addLast("d");
        list.printList();
        

    }
}