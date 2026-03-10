package home.packages;
public class Rectangle{
public static void main(String[] args) {
    Rectangle1 r= new Rectangle1();
   r.setlength(2);
   r.setbreadth(2);
   r.area();
   r.perimeter();
}
}
class Rectangle1 extends main_shape{
    private int length;
    private int breadth;
    public void setlength(int length){
        this.length=length;
    }
    public void setbreadth(int breadth){
        this.breadth=breadth;
    }
    public int  getlength(){
return length;
    }
 public int  getbreadth(){
return breadth;
    }
    public void area(){
        System.out.println("The area of rectangle is"+length*breadth);
    }
    public void perimeter(){
        System.out.println("The perimeter of rectangle is"+2*(length+breadth));
    }
}