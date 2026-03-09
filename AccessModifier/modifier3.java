package home.AccessModifier;
//Accessing through subclass
public class modifier3 {
    public static void main(String[]args){
c4 c= new c4();
c.display();
    }
}
 class c3{
    public int a=1;
    protected int b=2;
  //  private int c=3; -->Throws an error
    int d=4; //It is not acessible on subclass of another package but in subclass of same package it is accessible
}
class c4 extends c3{
    public void display(){
        System.out.println(a);
        System.out.println(b);
      //  System.out.println(c); 
        System.out.println(d);
    }
}