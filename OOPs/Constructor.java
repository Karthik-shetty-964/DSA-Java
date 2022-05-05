/*
  Constructor : These are the special methods which gets executed when a class is instantiated(means when the object is created.)

    Rules of constructors:
    * Class and constructor both should have the same name.
    * constructors will not have any return type or return value.
    * For one object, constructor is called only once.

    Types: 
    1.Non-parameterized constructor: 
          These are the constructors with no parameters.
    2.Parameterized constructor: 
          These are the constructors with parameters.
    3.Copy constructor: 
          These are the constructors used to copy one object to another object.

 */
import java.util.*;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name: "+name+" age: "+age);
    }

    // Non-parameterized constructor:
    // Student(){
    //     System.out.println("constructor called.");
    // }

    //Parameterized constructor:
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }


    //Copy constructor
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
}


public class Constructor{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);

            //  Student s=new Student(); //Calling non-parameterized constructor

            Student s1=new Student("Karthik",20); //calling parameterized constructor.
            s1.printInfo();

            Student s2=new Student(s1);  //Calling copy constructor
            s2.printInfo();

        }
}