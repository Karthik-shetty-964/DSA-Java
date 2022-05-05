/*
Access modifiers: Specify the accessability of an element or method.
Types: 

public: This allows the elements to be accessed from anywhere.Even outside the class or package.
default: When we dont specify the access modifier, it is automatically considered as default. Only the elements within the package can access it.
protected: It can accessed by anything within the package and outside the package only subclasses can access it.
private: These can be accessed only within the class. To access it from outside we need to use getters and setters.

*/
import java.util.*;

class Employee{
    public String name;
    int age;
    protected String role;
    private double salary;

    //Getters and setters
    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

}
public class AccessModifiers{
        public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             Employee e1=new Employee();
             e1.name="Karthik";
             System.out.println(e1.name);
             e1.age=20;
             System.out.println(e1.age);
             e1.role="Software developer";
             System.out.println(e1.role);

             e1.setSalary(500000);
             System.out.println(e1.getSalary());

        }
}