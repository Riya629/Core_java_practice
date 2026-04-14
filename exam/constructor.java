package home.exam;

public class constructor {
    public static void main(String[] args) {
        student s1= new student();
        student s2= new student("Riya",20);
        student s3= new student(20,1);
        s1.display();
        s2.display();
        s3.display();
    }
}
class student{
String name;
int age;
int id;
student(){
    name="Riya";
    age=20;
}
student(String name,int age){
    this.name=name;
    this.age=age;
 
}
student(int age, int id){
    this.age=age;
    this.id=id;
}
public void display(){
    System.out.println(name);
    System.out.println(age);
    System.out.println(id);
}
}