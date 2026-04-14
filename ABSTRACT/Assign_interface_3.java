package home.ABSTRACT;

public class Assign_interface_3 {
    public static void main(String[]args){
Human h = new Human();
h.speak();
h.eat();
h.sleep();

    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("The monkey jumps");
    }
    void bite(){
        System.out.println("The monkey bites");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Speaking...");
    }
    public void eat(){
        System.out.println("The human eats");
    }
    public void sleep(){
        System.out.println("The humans sleeps");
    }
}