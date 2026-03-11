package home.THREAD;

public class Assign_thread2 {
    public static void main(String[] args) {
        ThreadSecond ts1= new ThreadSecond();
        ThreadSecond2 ts2= new ThreadSecond2();
        ts1.start();
        ts2.start();
    }
}
class ThreadSecond extends Thread{
    public void run(){
        int i =0;
        while(i<3){
        System.out.println("Good morning");
        i++;
    }
}
}
class ThreadSecond2 extends Thread{
    public void run(){
         int i =0;
        while(i<3){
            try{
                Thread.sleep(10000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
         System.out.println("welcome");
        i++;
    }
      
    }
}