package home.method;
//Method overloading using static method . We create userdefined method in same class
public class method_use_static1 {
    public static void main(String []args){ //main method
display();
display1("Riya",20);
display2("sachet", 26, 'A');
    }

static void display(){
    System.out.println("This is static method with no parameters");
}
static void display1(String name, int age){
System.out.println("This is static method with parameter");
}
static void display2(String name, int age, char grade){
    System.out.println("This is static method with 3 parameters");
}
}