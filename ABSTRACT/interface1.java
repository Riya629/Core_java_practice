package home.ABSTRACT;
public class interface1 {
  public static void main(String[]args) {
AvonCycle ac= new AvonCycle();
ac.applybrake(2);
ac.speedup(2);
ac.color();
ac.brand();
//System.out.println(ac.a);
  } 
}
interface Bicycle{
    int a=4;  //we can create properties inside interface //properties are final it cannot be modified once it is declared
     void applybrake(int decrement);
   void speedup(int increment);
}
interface Bicycle2{  //we can create multiple interface
    void color();
    void brand();
}
class AvonCycle implements Bicycle, Bicycle2{
public void applybrake(int decrement){
  System.out.println("apply brake slowly");
}
public void speedup(int increment){
System.out.println("applying speedup");
}
public void color(){
    System.out.println("The color is blue");
}
public void brand(){
    System.out.println("This is korean  brand");
}
}