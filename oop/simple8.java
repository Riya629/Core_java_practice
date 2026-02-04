package home.oop;

public class simple8 {
   public static void main(String[]args) {
Rectangle r=new Rectangle();
r.l=2;
r.b=2;
r.area();
r.perimeter();
System.out.println(r.area());
System.out.println(r.perimeter());
   }
}
class Rectangle{
int l,b;
int area(){
    return l*b;
}

int perimeter(){
return 2*(l+b);
}
}