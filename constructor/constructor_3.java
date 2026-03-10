package home.constructor;

public class constructor_3 {
    public static void main(String[]args){
Mstaff ms =new Mstaff();
Mstaff ms2 = new Mstaff("sachet" ,30);
System.out.println(ms.name);
System.out.println(ms2.name);
    }
}
class Mstaff{
    String name;
    int age;

Mstaff(){       //Default constructor
    name="Riya";
    age=20;
    System.out.println(name);
    System.out.println(age);
}

Mstaff(String n, int a){
    name=n;
    age=a;
    System.out.println(name);
    System.out.println(age);
}

}
