package home.exam;

public class abstract2 {
    public static void main(String[] args) {
        Animal1 a= new dog1();// e cannot call the child method using abstract reference
        a.sound();
       // a.eat();
    }
}
abstract class Animal1{
    abstract void sound();
}
class dog1 extends Animal1{
    public void sound(){
        System.out.println("sounding");
    }
    public void eat(){
        System.out.println("eating");
    }
}