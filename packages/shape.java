package home.packages;

public class shape {
    public static void main(String[] args) {
        square1 s= new square1();
    }
}
class shape1{
    shape1(){
        System.out.println("This is parent constructor");
    }
}
class Rectangle2 extends shape1{
    Rectangle2(){
        System.out.println("This is rectangle sub class");
    }
}
/*class square extends shape1{  //only parent class and squaresub class runs
    square(){
        System.out.println("This is square subclass");
    }
}*/   
class square extends Rectangle2{          //This runs all constructor since the rectangle has extends the shape1
    square(){
        System.out.println("This is square constructor");
    }
}