package home.constructor;

public class constructor_2 {
    public static void main(String []args){
Mystaff ms=new Mystaff();
ms.display();
    }
}
class Mystaff{
    String name;
    int age;

    Mystaff(){
        name="Sachet";
        age=26;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}