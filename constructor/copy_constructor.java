package home.constructor;

public class copy_constructor {
    public static void main(String[]args){
people p=new people("Riya",20);
people p2=new people(p);
p.display();
 p2.display();//displaying without changing value
//changing the value of copy constructor object making it independent
p2.name="sachet";
p2.age=26;
p2.display(); //displaying after chnaging the value
    }
}
class people{
    String name;
    int age;
 
    people(String n, int a){ //parameterized constructor
        name=n;
        age=a;
    }
    people(people p){
        name=p.name;
        age=p.age;
    }

void display(){
    System.out.println(name);
      System.out.println(age);
}



}