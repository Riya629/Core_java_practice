package home.AccessModifier;

public class private_circle {
    public static void main(String[]args){
circle c= new circle();
c.setarea(2);
c.setperimeter(2);
System.out.println(c.getperimeter());
System.out.println(c.getarea());
    }
}
class circle{
 private double radius;

 void setarea( int r){
radius=r;
 }
 double getarea(){
    return 2.14*radius*radius;
 }
  void setperimeter( int r){
radius=r;
 }
double getperimeter(){
  return 2*2.14*radius;
  
 }

}