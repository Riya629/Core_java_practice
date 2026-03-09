package home.ABSTRACT;
//polymorphism
public class Assign_Abstract_4 {
    public static void main(String[]args){
Telephone t = new SmartTelephone();
t.ring();
t.lift();
t.disconnect();
    }
}
 abstract class Telephone{
  abstract  void ring();
  abstract void lift();
  abstract void disconnect();
}
class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Ringing......");
    }
    void lift(){
        System.out.println("lifting.....");
    }
    void disconnect(){
        System.out.println("Disconnecting......");
    }
}