package home.oop;

public class simple7 {
   public static void main(String[]args) {
square sq= new square();
sq.l=2;
sq.area();
int area=sq.area();
System.out.println(area);
sq.perimeter();
int perimeter=sq.perimeter();
System.out.println(perimeter);
   }
}

class square{
    int l;
    int area(){
        int a=l*l;
        return a;
    }

    int perimeter(){
        int p=4*l;
        return p;
    }
}
/* 
sq.side=4;
System.out.println(sq.area());
System.out.println(sq.perimeter());
   }
}


class square{
  int side;
int area(){
    return side*side;
}
int perimeter(){
    return 4*side;
}
}*/




