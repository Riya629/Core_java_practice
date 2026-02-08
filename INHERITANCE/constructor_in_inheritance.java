package home.INHERITANCE;

public class constructor_in_inheritance {
    public static void main(String[]args){
//base1 b1= new base1();   // if b1 object is not created then also the base2 constructor call the base 1 as well as base 2 at first it ru b1 and b2
base2 b2= new base2();
    }
}
class base1{
base1(){
    System.out.println("Iam constructor");
}

}
class base2 extends base1{
base2(){
    System.out.println("Iam base2 constructor");
}
}