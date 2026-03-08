package home.ABSTRACT;
//first priority to subclass and parent class and then interface!important
public class interface2 {
    public static void main(String[]args){
square s= new square();
s.area();
s.perimeter();
    }
}
interface shape1{   
    void area();
    private void greet(){
    System.out.println("Good morning");
    }
    default void perimeter(){ 
        greet();             //we cannot directly the private method in main so we call it in static or default method
    System.out.println("This is the perimeter of interface");
    }
}
class Rectangel1{
    int length=2;
    int breadth=2;
    public void area(){
        System.out.println("The area of rectangle is:"+ length*breadth);
    }
   public void perimeter(){
    System.out.println("The perimter of rectangle is:"+2*(length+breadth));
   }
}
class square extends Rectangel1 implements shape1{
    public void area(){
        System.out.println("The area of square is:"+length*length);
    }
     public void perimeter(){
        System.out.println("The area of perimter is:"+4*length);
    }
}