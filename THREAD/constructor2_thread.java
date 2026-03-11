package home.THREAD;

public class constructor2_thread {
public static void main(String[] args) {
    MythreadR mr= new MythreadR("sachet"); 
    mr.start();
    System.out.println("This is superclass Thread constructor name :"+mr.getName());
    System.out.println("The is of thread is"+mr.getId());
}
}
class MythreadR extends Thread{
    public MythreadR(String name){
        super(name);
        System.out.println("This is subclass constructor:"+name);
    }
    public void run(){
        System.out.println("This is MythreadR name is Running....");
    }
}