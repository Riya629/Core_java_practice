package home.THREAD;

public class Runnable4 {
    public static void main(String[] args) {
        Myrunnable4 m4= new Myrunnable4();
        Thread t1= new Thread(m4);
    m4.start();    //runnable doesnot create object by itself it define the work
        t1.start();
    // m4.display();
    }
}
/*class Myrunnable3 {
    public void display(){
        System.out.println("The parent class is running");
    }
}*/
class Myrunnable4  extends Thread implements Runnable{
    public void run(){
        System.out.println("The sub class is running.....");
    }
}