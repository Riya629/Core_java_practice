package home.method;

public class method_overriding_1 {
    public static void main(String[]args){
Memployee_1 me=new Memployee_1();
me.display("Bca",201);
    }
}
class Memployee{
    String name;
    int age;
    public void display(String name, int age){
this.name=name;
this.age=age;
System.out.println("This is method of parent class"+name);
System.out.println("This is method of parent class"+age);
    }
}
class Memployee_1 extends Memployee{
    String faculty;
    int id;
    public void display(String faculty, int id){
      
        this.faculty=faculty;  //without using super we assign value here
        this.id=id;
        super.display("Riya",20);  //so same method name so we cannot give value to parent using the object of child class so we used super keyword
      
        System.out.println("This is the method of child class"+faculty);
          System.out.println("This is the method of child class"+id);
    }
}