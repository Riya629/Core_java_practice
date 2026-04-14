package home.exam;

public class ovwrriding {
    public static void main(String[] args) {
        employee2 e = new employee2();
        e.display("Riya",20);
    }
}
class emplyooe{
    String name;
    int age;
    public void display(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println(name);
        System.out.println(age);
    }
}
class employee2 extends emplyooe{
    public void display(String name, int age){
System.out.println(name);
System.out.println(age);
   }
}