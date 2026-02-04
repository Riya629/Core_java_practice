package home.oop;
//creating our own javaa class
public class simple3 {
    public static void main(String[]args){

//creating object


staff s=new staff();
staff s2=new staff();

//setting atrributes for s
s.name="sachet";
s.age=26;
s.id=2;
s.salary=100000;

//setting strributes for s2
s2.name="Riya";
s2.age=20;
s2.id=1;
s2.salary=200000;

//printing the atrributes
s.display();
s2.display();
s2.getsalary();
int salary=s2.getsalary();
System.out.println(salary);
    }
}
class staff{
    String name;
    int age;
    int id;
    int salary;


void display(){
System.out.println(name);
System.out.println(age);
System.out.println(id);
}
 int getsalary(){
    return salary;
}
}