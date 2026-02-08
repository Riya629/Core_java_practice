package home.INHERITANCE;
//invoking constructor using super keyword
public class super_1 {
    public static void main(String[]args){
    super2 s=new super2(5);
}
}
class super1{
super1(int a){
    System.out.println("This is super1"+a);
}
super1(){
    System.out.println("This is default constructor");
}
}
class super2 extends super1{
super2( int x){
  super(x);
    System.out.println("This is super2");
}
}