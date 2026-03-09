package home.ABSTRACT;
public class Assign_Abstract_5{
    public static void main(String[]args){
BasicAnimal2 ba= new Human2();
//ba.speak();  --> This throws an error because in polymorphism the only method which interface include is called using its reference
ba.sleep();
ba.eat();
    }
}
interface BasicAnimal2{
    void eat();
    void sleep();
}
class Monkey2{
    void jump(){
        System.out.println("The monkey jumps");
    }
    void bite(){
        System.out.println("The monkey bites");
    }
}
class Human2 extends Monkey2 implements BasicAnimal2{
    public void speak(){
        System.out.println("speaking....");
    }
    public void sleep(){
        System.out.println("Speaking...");
    }
    public void eat(){
        System.out.println("Eating.......");
    }
}