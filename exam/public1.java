package home.exam;

public class public1 {
    public static void main(String[] args) {
     demo2 d = new demo2();
     d.display("Riya",20);
    }
}
class demo2{
    public String name;
    public int age;
    public void display(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println(name);
        System.out.println(age);
    }
}