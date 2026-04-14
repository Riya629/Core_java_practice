package home.exam;

public class abstract1 {
   public static void main(String[] args) {
    dog d= new dog();
    d.sound();
    d.eat();
   } 
}
abstract class animal{
  abstract  void sound();
    public void eat(){
        System.out.println("eating.......");
    }
}
class dog extends animal{
public void sound(){
    System.out.println("Dog barks");
}
public void eat(){ //override
    System.out.println("dog eats");
}
}