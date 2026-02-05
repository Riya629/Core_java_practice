package home.constructor;

public class parameterized {
    public static void main(String []args){
Mestaff me= new Mestaff("Riya",20);
me.display();
    }
}
class Mestaff{
    String name;
    int age;

    Mestaff(String n, int a){
name=n;
age=a;
}
void display(){
System.out.println(name);
System.out.println(age);
}
}