/*
Interface: 
   An interface is a blue print of a class. Interface consists of static variables and the abstract classes.
   Interface provides us the way for pure abstraction.
   Interface provides multiple inheritance  capability to the program.

    Rules for Interfaces:
    * All the fields(variables) are public,static and final by default.
    * All the methods are public and abstract by default.
    * The class which implements interfaces must implement all the methods defined within the interface.
    * Interface provides us multiple inheritance facility.
 */
import java.util.*;

interface Animal{
    int eyes=2; //This varible is public ,static and final by default.
    void walk();  //This method is public and abstract by default.
}

interface Herbivorus{
    void eat();
}

class Horse implements Animal,Herbivorus{//Multiple inheritance
    public void walk(){
        System.out.println("Walks on 4 legs");
    }

    public void eat(){
        System.out.println("hey! I am Herbivorus.");
    }
}

public class Interfaces{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             Horse karayel=new Horse();
             karayel.walk();
             karayel.eat();
        }
}