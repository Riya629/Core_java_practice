package home.method;
//with static we can directky call the userdefined method in main method
public class method_overloading6 {
    public static void main(String[]args){
method();
method(5.4, 2.3);
method(55.67, 98.9);
    }

static void method(){
    String name="Riya";
    int age=20;
}
static void method(float height, float id){
System.out.println(height);
System.out.println(id);
}
static void method(double weight, double marks){
    System.out.println(weight);
    System.out.println(marks);
}
}