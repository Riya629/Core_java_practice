package home.THREAD;
//Method use in constructor Thread (String name, runnable r)
public class constructor_runnable1 {
   public static void main(String[] args) {
    MyrunnableR mr = new MyrunnableR("Riya");
    Thread t = new Thread(mr,"Riya");
    t.start();
    System.out.println("The name of Myrunnable is:"+t.getName());
   } 
}
class MyrunnableR implements Runnable{
    String name;
   public  MyrunnableR(String name){
    this.name=name;
    System.out.println("The name of subclass is"+name);
   }
   public void run(){
    System.out.println("The MyrunnableR is running........."); //when we use this it refer to runanable object not thread so got error
   }
}