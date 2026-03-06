package home.project;

public class Assign1 {
    public static void main(String[]args){
//circle c= new circle(2);
cylinder c1=new cylinder(2,4);
System.out.println(c1.area());
//System.out.println(c.area());
    }
}
class circle{
   public int radius;
   circle(int radius){
this.radius=radius;
   }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class cylinder extends circle{
public int height; 
cylinder(int radius, int height){
    super(radius);
    this.height=height;
}
public double area(){
return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
}
}