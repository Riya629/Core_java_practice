package home.INHERITANCE;

public class constructor_inheritanceee {
    public static void main(String[] args) {
        Mstudent_1 ms = new Mstudent_1(20);

    }
}

class Mstudent {
    String name;
    int age;

    Mstudent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is name of parent class" + name);
        System.out.println("This is age of parent class" + age);
    }
}

class Mstudent_1 extends Mstudent {
    int id;

    Mstudent_1(int id) {
        super("Riya",20); // if the parent and child class contain the parameters in constructor then
        // it is not possible to pass value in parent class using object of chilf class
        // so
        // we use super keyword to pass value to pareant classs in child child
        this.id = id;

        System.out.println("This is id of child class" + id);
    }
}
