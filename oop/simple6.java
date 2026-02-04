package home.oop;

public class simple6 {
   public static void main(String[]args) {
cellphone iphone=new cellphone();
iphone.ringing();
iphone.vibrating();


   }
}
class cellphone{
    void ringing(){
        System.out.println("ringing......");
    }

    void vibrating(){
        System.out.println("vibrating.......");
    }
}