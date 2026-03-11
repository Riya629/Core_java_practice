package home.THREAD;
// single inheritance is allowed in extending thread
public class Thread2 {
    public static void main(String[] args) {
        Mythread4 m4= new Mythread4();
        m4.start();
        Mythread3 m3 = new Mythread3();
        m3.start();
    }
}
    class Mythread3 extends Thread{
public void run(){
    System.out.println("Mythread3 is running.....");
}
    }
    class Mythread4 extends Thread{
        public void run(){
            System.out.println("Mythread4 is running......");
        }
    }