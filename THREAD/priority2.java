package home.THREAD;

public class priority2 {
    public static void main(String[] args) {
        thr t1= new thr("Thread1");
         thr t2= new thr("Thread2");
          thr t3= new thr("Thread3");
          t1.setPriority(Thread.MIN_PRIORITY);
          t2.setPriority(Thread.NORM_PRIORITY);
          t3.setPriority(Thread.MAX_PRIORITY);
        /*  System.out.println("The name of thread1 is:"+t1.getName());
          System.out.println("The priority of thread1 is"+t1.getPriority());
            System.out.println("The name of thread2 is:"+t2.getName());
            System.out.println("The priority of thread2 is"+t2.getPriority());
              System.out.println("The name of thread3is:"+t3.getName());
              System.out.println("The priority of thread3 is"+t3.getPriority());        we can print in this way toooo*/
t1.start();
t2.start();
t3.start();

    }
}
class thr extends Thread{
    thr(String name){
        super(name);
    }
    public void run(){
        System.out.println("The name of Thread is:"+this.getName());//This print all the name and priority of all object
        System.out.println("The priority of Thread is:"+this.getPriority()); //--> we can use this in extendsing thread cause it referes to thread object
    }
}