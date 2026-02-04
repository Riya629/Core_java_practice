package home.oop;

public class simple9 {
    public static void main(String[]args){
TomyVecetti tm= new TomyVecetti();
tm.hit();
tm.run();
tm.fire();
    }
}
class TomyVecetti{
    void hit(){
        System.out.println("Hitting.....");
    }
    void run(){
        System.out.println("Running.......");
    }
    void fire(){
        System.out.println("Firing......");
    }
}