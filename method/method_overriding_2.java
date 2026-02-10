package home.method;

public class method_overriding_2 {
    public static void main(String[]args){
Dog d= new Dog(); // we can do this too for overriding without using super keyword
d.sound();
    }
}
class Animal{
void sound(){
    System.out.println("Animal make sound");
}
}
class Dog extends Animal{
    void sound(){
        super.sound();      //overriding using super keyword
        System.out.println("dog barks");
    }
}