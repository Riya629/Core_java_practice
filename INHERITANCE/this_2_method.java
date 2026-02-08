package home.INHERITANCE;

public class this_2_method {
    public static void main(String[]args){
method2 m= new method2();
m.method("riya");
    }
}
class method2{
    String name;

    void method(String name){ //this is used to refer to the object variable as this 2 method and variable have same name
    this.name=name;
    System.out.println(name);
    }
}