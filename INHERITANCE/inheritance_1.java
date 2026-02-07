package home.INHERITANCE;

public class inheritance_1 {
    public static void main(String[] args) {
       base b = new base(); //creating an object of base class and acessing the value of base class but using derived object we cannot acess base 
          b.setnum(2);
        System.out.println(b.getnum());

        //creating an object of derives class and accessing the value of base class
        derived d= new derived();
        d.setnum(3);
        System.out.println(d.getnum());
       
   /*we can create the derived class object and used it to access base class because the derived class has all the properties 
   base class as it extends the base class but we cannot access the derived class by using the object of base class as the
   base class doesnot include the features of derived class

*/

    }

}

class base {
    int num;

    void setnum(int n) {
        num = n;
    }

    int getnum() {
        return num;
    }
}

class derived extends base {
    int num2;

    void setnum2(int N) {
        num2 = N;
    }

    int getnum2() {
        return num2;
    }
}