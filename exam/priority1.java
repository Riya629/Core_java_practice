package home.exam;

public class priority1 {
    public static void main(String[] args) {
        Mythr1 m = new Mythr1("Riya");
        Mythr1 m2= new Mythr1("sachet");
        Mythr1 m3= new Mythr1("Riyan");

        m.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.NORM_PRIORITY);
        m3.setPriority(Thread.MAX_PRIORITY);
        m.start();
        m2.start();
        m3.start();
    }
}
class Mythr1 extends Thread{
    Mythr1(String name){
        super(name);
    }
    public void run(){
        System.out.println(this.getName() +this.getPriority());
    }
}