/*
Fuction overloading (Compile time polymorphism);
  Funtion overloading is the concept in which functions with same name perform different tasks.

  Rules: 
  * Functions should have same names
  * But they should be different in case of either parameter type, return type or number of parameters.

  Function overloading is also called as compile time polymorphism because the errors will be detected during the compilation of the program, 
  but in case of Funtion overiding(Run time polymorphism) errors will be detected only during execution of the program.

*/

import java.util.*;
class Student{
    String name;
    int age;

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}

public class FunctionOverloading{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             Student s1=new Student();
             s1.name="Karthik";
             s1.age=20;

             s1.printInfo(s1.age);

             s1.printInfo(s1.name);

             s1.printInfo(s1.name,s1.age);

        }
}