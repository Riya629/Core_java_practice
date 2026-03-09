package home.AccessModifier;
//Acessing the variable from the subclass of another file of same package
public class modifier4 {
    public static void main(String[]args){
c6 c = new c6();
c.display();
    }
}
class c5{
    public int a=2;
    protected int b=3;
  //  private int c=4;
    int d=5;
}
class c6 extends c3{
public void display(){
    System.out.println(a);
    System.out.println(b);
   // System.out.println(c);
    System.out.println(d);
}
}