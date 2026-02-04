package home.oop;

public class simple2 {
    public static void main(String[]args){
        student s= new student();
        s.age=12;
        s.name="Riya";
     s.detail();
        
}
}
class student{
    int age;
    String name;
    void detail(){
        System.out.println(age);
        System.out.println(name);
    }
    }
