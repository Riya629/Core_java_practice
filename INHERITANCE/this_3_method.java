package home.INHERITANCE;
//example of this keyword in method
public class this_3_method {
    public static void main(String[]args){
fruit f= new fruit();
f.display("Apple");
    }
}
class fruit{
    String name; //instance variable
    void display(String name){
        this.name=name;
        System.out.println("This is example of this keyword used in method");
    }
}