package home.constructor;

public class constructor_1 {
    public static void main(String[]args){
Mystudent my= new Mystudent();
//my.setname("Riya");
//my.setage(20);
my.display();
}

    }

class Mystudent{
 private String name;
  private int age;
 
Mystudent(){
    name="Riya";
    age=20;
}

void display(){
  System.out.println(
    name );
    System.out.println(age);
}

//setter and getter
 /*void setname(String n){
name=n;
  }*/
/*String getname(){
    return name;
}

/*void setage(int a){
age=a;
  }
int getage(){
    return age;
}
*/
}