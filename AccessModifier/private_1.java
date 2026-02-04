package home.AccessModifier;

public class private_1 {
    public static void main(String[]args){
MyEmployee me= new MyEmployee();
me.setname("Riya");
me.setage(20);
int age=me.getage();
System.out.println(age);
String name=me.getname();
System.out.println(name);
    }

}
class MyEmployee{
private String name;
   private int age;

 void setname(String n){
name=n;
 }

String getname(){
    return name;
 }
void setage(int a){
age=a;
}
int getage(){
    return age;
}
}