/*
Function overriding:
   If a subclass implements the same method present in the super class.It is called function overriding.
   The overiden method must be identical with the overrided method of superclass in all aspects. 
 */
import java.util.*;
class A{
    public void meth1(){
        System.out.println("I am the method of class A.");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am the method of class B.");
    }
}
public class FunctionOverriding{
       public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             A a=new A();
             B b=new B();
             a.meth1();
             b.meth1();
        }
}