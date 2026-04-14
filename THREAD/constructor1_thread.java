package home.THREAD;

public class constructor1_thread {
    public static void main(String[] args) {
        Mythreadd m= new Mythreadd("Riya");
        m.start();
      // System.out.println("The name of thread is:"+m.getName()); 
       //System.out.println("The thread Id is:"+m.threadId());//-->by doing this we are initializing the Thread class
    }
}
class Mythreadd extends Thread{
    public Mythreadd(String name){
        super(name);
  //  System.out.println(name); // --> By doing this we are passsing value to subclass object we initialize subclass object
    }
public void run(){
    System.out.println("the thread is running.."+this.getName());
    System.out.println("The thread Id is:"+this.threadId());
}

}