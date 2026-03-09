package home.AccessModifier;
//Acessing from same package
public class modifier2 {
   public static void main(String[]args) {
c2 c= new c2();
System.out.println(c.a);
System.out.println(c.b);
//System.out.println(c.c); --> Throws an error beacsue the private varuable cannot be access from the same package
System.out.println(c.d); 
c.setvariable(6); // we change the value of variable
System.out.println(c.getvariable()); // we get it by getter method
   }
}
class c2{
    public int a=2;
    protected int b=3;
    private int c=4;// to access it we use getter method and if it was not initialized or want to chnage vakue we use setter method and getter method
    void setvariable(int c){
        this.c=c;
    } 
   int getvariable(){
return c;
   }
    int d= 5;
}