package home.INHERITANCE;

public class super_3 {
    //methods invoking
    public static void main(String[]args){
classy2 c=new classy2();
c.display();
    }
}
class classsy{
    String name;
    int age;


    void methody(){
System.out.println("This is method1");
    }
}
class classy2 extends classsy{
    void methody(){
System.out.println("This is method 2");
    }

     void display(){
        methody();
        super.methody();
    }
}