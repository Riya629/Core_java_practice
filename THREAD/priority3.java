package home.THREAD;

public class priority3 {
    public static void main(String[] args) {
        myRunn r = new myRunn("Riya");
        Thread t1= new Thread(r,"sachet");
        Thread t2= new Thread(r,"Riyan");
        Thread t3= new Thread(r,"Riya");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The name of thread1 is:"+t1.getName());
        System.out.println("The priority of thread1 is:"+t1.getPriority());
        System.out.println("The name of thread2 is:"+t2.getName());
        System.out.println("The priority of thread2 is:"+t2.getPriority());
        System.out.println("The name of thread3 is:"+t3.getName());
        System.out.println("The priority of thread3 is:"+t3.getPriority());
        t1.start();
        t2.start();
        t3.start();



    }
}
class myRunn implements Runnable{
    myRunn(String name){
        System.out.println("This is Runnable...");
    }
    public void run(){
        System.out.println("The name of priority is:"+Thread.currentThread().getName());
        System.out.println("The priority of thread is:"+Thread.currentThread().getPriority());
        
    }
}
