package home.oop;

public class simple5 {
    public static void main(String[]args){
parent p= new parent();
p.salary=30;
p.getsalary();
int salary=p.getsalary();
System.out.println(salary);

p.setname("Riya");
p.getname();
String name=p.getname();
System.out.println(name);
    }
}
class parent{
    String name;
   
    int salary;


    int getsalary(){
return salary;
    }

    String getname(){
        return name;
    }

    void setname(String n){
name=n;
    }
}