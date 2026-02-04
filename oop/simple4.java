package home.oop;

public class simple4 {
    public static void main(String[] args) {
        Employee e = new Employee();
       
        //printing atrributes
       

     e.salary = 2000;
     e.getsalary();
        System.out.println(e.getsalary());
            e.setname("sachet");
            System.out.println(e.getName());
        
    }
}

// userdefined class
class Employee {

    int salary;
    String name;

    int getsalary() {
        return salary;
    }

    String getName() {
        return name;
    }

   void setname(String n) {
      name=n;
    }

}