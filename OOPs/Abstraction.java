/*
Abstraction:
  Abstraction is the method of hiding the implementation details and providing the essential details to the user.
  Types of abstraction:
  1]using abstract class and methods
  2]using interfaces.

  rules of abstract class: 
  * The abstract class is declared using abstract keyword.
  * Abstract class can have both abstract and non-abstract methods.
  * They can not be instantiated.
  * They can have constructors and static methods.
  * They can also have methods with final keyword which prevents subclasses to change the body of the method.
 */
 import java.util.*;
abstract class Animal{
    abstract void walk();
    String color;
    Animal(){
        System.out.println("This is the constructor of base abstract class");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("This is the constructor of horse class");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
 public class Abstraction{
        public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              Horse karayel = new Horse();
              karayel.color="black";
              System.out.println(karayel.color);
         }
 }