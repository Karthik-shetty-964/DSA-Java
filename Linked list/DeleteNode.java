/*
delete node in a linked list.
*/
import java.util.*;
public class DeleteNode{
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

        DeleteNode list=new DeleteNode();
        list.printList();
       
        list.add("10");
        list.add("20");
        list.add("30");
        list.printList();

        

    }
}