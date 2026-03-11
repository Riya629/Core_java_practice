package home.THREAD;

public class constructor_interface3 {
    public static void main(String[] args) {
        MyRun m= new MyRun("Riya");
        Thread t= new Thread(m,"Riya");
        t.start();
        System.out.println("The name of thread is:"+t.getName());//Thread class name
        System.out.println("The Id of thread is:"+t.threadId());//Thread class Id
    }
}
class MyRun implements Runnable{
String name;
public MyRun(String name){
this.name=name;
System.out.println("The name of subclass is:"+name);//name of subclass
}
public void run(){
    System.out.println("The name of subclass method is"+name );//Method run after creating thread
}
}