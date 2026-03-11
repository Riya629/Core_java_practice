package home.THREAD;

public class prority1 {
    public static void main(String[] args) {
        Mythr t1= new Mythr("riya");
         Mythr t2= new Mythr("sachet");
          Mythr t3= new Mythr("Riyan");
           Mythr t4= new Mythr("pabitra(Most important)");
        t4.setPriority(Thread.MAX_PRIORITY);
   //      System.out.println("the priority"+t3.setPriority(Thread.MIN_PRIORITY)); Error cause it is void so cant print
        t1.start();
          t2.start();
            t3.start();
              t4.start();
             
    }
}
class Mythr extends Thread{
    Mythr(String name){
        super(name);
    }
    public void run(){
       
        System.out.println("The priority of thread is:"+this.getName());
        System.out.println("Ths priority of therad is:"+this.getPriority());
       
}
}