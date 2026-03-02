package home.method;

public class method_overriding_dynamic_1 {
    public static void main(String[]args){
person1 p = new student1();
p.display("Riya",20);
    }
}
 class person1{
    String name;
    int age;
    public void display(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("This is name of superclass"+name);
        System.out.println("This is age of superclass"+age);
    }
 }
 class student1 extends person1{
    public void display(String name, int age){
    System.out.println("This is name of subclass"+name);
        System.out.println("This is age of subclass"+age);
    }
 }