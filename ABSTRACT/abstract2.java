package home.ABSTRACT;
// we can create an abstract method an non-abstract method in abstract class but abstract method must be implemented by subclass..
public class abstract2 {
    public static void main(String[]args){
child2 c2= new child2();
c2.sayGoodMorning();
c2.sayhello();
    }
}
 abstract class parent2{
    public void sayGoodMorning(){
        System.out.println("Iam saying good morning");
    }
    parent2(){
        System.out.println("This is parent class constructor");
    }
    abstract public void sayhello();
}
class child2 extends parent2{
   public void sayGoodMorning(){
        System.out.println("Good morning from the sub class");
    }
        
    public void sayhello(){
        System.out.println("Hello Everyone");
    }
}