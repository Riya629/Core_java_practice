package home.THREAD;
//creating thread my implementing Runnable
public class Runnable1 {
    public static void main(String[] args) {
        MyRunnable1 r1= new MyRunnable1();
        MyRunnable2 r2= new MyRunnable2(); 
       Thread t1= new Thread(r1);
       Thread t2= new Thread(r2);
       t1.start();
       t2.start();
    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        System.out.println("MyRunnable1 is running.....");
         System.out.println("MyRunnable1 is running.....");
          System.out.println("MyRunnable1 is running.....");
           System.out.println("MyRunnable1 is running.....");
           System.out.println("MyRunnable1 is running.....");
         System.out.println("MyRunnable1 is running.....");
          System.out.println("MyRunnable1 is running.....");
           System.out.println("MyRunnable1 is running.....");
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        System.out.println("MyRunnable2 is running.....");
        System.out.println("MyRunnable2 is running.....");
        System.out.println("MyRunnable2 is running.....");
        System.out.println("MyRunnable2 is running.....");
         System.out.println("MyRunnable2 is running.....");
        System.out.println("MyRunnable2 is running.....");
        System.out.println("MyRunnable2 is running.....");
        System.out.println("MyRunnable2 is running.....");
    }
}