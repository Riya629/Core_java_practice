package home.THREAD;

public class thread1 {
    public static void main(String[] args) {
        Mythread1 m1= new Mythread1();
        Mythread2 m2= new Mythread2();
m1.start();
m2.start();
    }
}
class Mythread1 extends Thread{    // we create Mythread subclass and extends the Thread which is available in java
public void run(){
    System.out.println("My thread 1 is running");
}
}
class Mythread2 extends Thread{
    public void run(){
        System.out.println("My thread 2 is running");
    }
}