package home.INHERITANCE;

public class inheritance2 {
    public static void main(String[]args){
Animal a =new Animal();
a.sound();
Dog d= new Dog();
d.sound(); //creating child class object but accessing the properties of animals
    d.bark();

    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes sounds");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}