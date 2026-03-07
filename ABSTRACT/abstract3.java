package home.ABSTRACT;

public class abstract3 {
    public static void main(String[]args){
Rectangle r= new Rectangle();
System.out.println(r.area(2,3));
System.out.println(r.perimeter(2, 3));
    }
}
 abstract class shape{
    int length;
    int breadth;
    abstract public int area(int length, int breadth);
    public int perimeter(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
return 2*(length+breadth);
    }

}
class Rectangle extends shape{
       public int area(int length, int breadth){
return length*breadth;
       }
       public int perimeter(int length, int breadth){
        System.out.println("overridding the super class");
return 2*(length+breadth);
}
}