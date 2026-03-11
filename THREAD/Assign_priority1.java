package home.THREAD;
//practising the prority to print from main and subthread too
public class Assign_priority1 {
    public static void main(String[] args) {
        Threadprio tp1 = new Threadprio("Riya");
         Threadprio tp2 = new Threadprio("sandy");
          Threadprio tp3 = new Threadprio("ichya");
       
        tp1.setPriority(Thread.MIN_PRIORITY);
        tp2.setPriority(Thread.NORM_PRIORITY);
        tp3.setPriority(Thread.MAX_PRIORITY);
         System.out.println("The name of thread1 main is:"+tp1.getName());
        System.out.println("The priority of thread1 main is:"+tp1.getPriority());
        System.out.println("The name of thread2  main is :"+tp2.getName());
        System.out.println("The priority of thread2 main is:"+tp2.getPriority());
        System.out.println("The name of thread3  main is:"+tp3.getName());
        System.out.println("The priority of thread3 main is:"+tp3.getState());//state
        tp1.start();
        tp2.start();
        tp3.start();
    }
}
class Threadprio extends Thread{
Threadprio(String name){
    super(name);
}
public void run(){
    System.out.println("The name of thread2 is :"+this.getName());
    System.out.println("The priority of thread2 is:"+this.getPriority());
}
}