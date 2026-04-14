package home.exam;
//Example of instance variable
public class instancevariable {
    public static void main(String[] args) {
        insvariable i1 = new insvariable();
          insvariable i2 = new insvariable();
        i1.age=18;
        i2.age=20;
        i1.display();
           i2.display();
    }
}
class insvariable{
    int age;
    void display(){
        System.out.println(age);
    }
}