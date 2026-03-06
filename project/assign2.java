package home.project;
//Assignment
public class assign2 {
    public static void main(String[]args){
Cuboid c= new Cuboid(2,2,2);
System.out.println(c.area());
System.out.println(c.volume());
    }
}
class Rectangle{
    int length;
    int breadth;
    int width;
    int height;
    Rectangle(){
        System.out.println("This is super class default constructor");
    }
    Rectangle(int length, int breadth,int height){
        this.length=length;
        this.breadth=breadth;
this.height=height;
        System.out.println("This is super class parameterized constructor");
    }
    public int area(){
return length*breadth;
    }
    public int volume(){
        return length*height*width;
    }
}
class Cuboid extends Rectangle{
    Cuboid(int length, int breadth, int height){
  super(length, breadth,height); //without super the subclass will not get the value will be null.coz it overides the superclass we need need parameterized constructor
  System.out.println("This is subclass with parameterized constructor");
    }
    public int area(){
        return 2*( length * breadth + breadth * height + length * height);
    }
    public int volume(){
        return  length * breadth * height;
    }
}