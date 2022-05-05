/*
 OOPs basic introduction.
 defining classes and objects.
 */
class Pen{
    String color;
    String type;//blue point or gel

    public void writing(){
        System.out.println("I am writing with a pen.");

    }

    public void printColor(){
        System.out.println(this.color);
    }
}


 public class OOPs{
     public static void main(String[] args){
         Pen pen1=new Pen();
         pen1.color="blue";
         pen1.type="ballpoint";

         Pen pen2=new Pen();
         pen2.color="black";
         pen2.type="gel";

         pen1.printColor();
         pen2.printColor();
     }
 }