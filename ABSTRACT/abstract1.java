//Abstract Example 
//In abstract class no object and in abstract method no body so we must implement it by subclass and method
//the method which are in abstract class must be in sub  concrete class
package home.ABSTRACT;

public class abstract1 {
    public static void main(String[]args){
Dog d= new Dog();
d.sound();
    }
}
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}