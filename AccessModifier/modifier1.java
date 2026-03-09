package home.AccessModifier;
//Acessing through the same class
public class modifier1 {
    public static void main(String[]args){
c1 c= new c1();
c.display();
    }
}
class c1{
    public int a=1;
    protected int b=2;
private int c=3;
int d=4;
public void display(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
}
}