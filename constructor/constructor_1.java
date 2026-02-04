package home.constructor;

public class constructor_1 {
    public static void main(String[]args){
Mystudent my= new Mystudent("Sachet");
//my.setname("Riya");
//my.setage(20);
System.out.println(my.getname());
System.out.println(my.getage());
}

    }

class Mystudent{
 private   String name;
  private  int age;
 
Mystudent(String myname){
    name=myname;
    age=20;
}

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