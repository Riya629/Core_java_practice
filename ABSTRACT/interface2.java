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
   default void perimeter(){
    System.out.println("This is the perimeter of interface");
   }
}
class Rectangle1{
    int length=2;
    int breadth=2;
    public void area(){
        System.out.println("The area of reactangle is:"+length*breadth);
    }
   /*  public void perimeter(){  //when the method doesnot overide the parent method that the object created of child method runs the parent method
        System.out.println("The perimeter of reactangle is:"+2*(length+breadth));
    }*/
}
//when the class doesnot overide the method of interface in that case the default method of interface will run 
class square extends Rectangle1 implements shape1{
    int length=2;
    public void area(){
        int area=length*length;
         System.out.println("The square area is:"+area);
    }
   /*  public void perimeter(){
        int perimeter=4*length;
        System.out.println("The square perimeter is:"+perimeter);
    }*/
}