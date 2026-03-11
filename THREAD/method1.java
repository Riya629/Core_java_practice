package home.THREAD;

public class method1 {
    public static void main(String[] args) {
        thre1 t = new thre1();
        thre2 t2= new thre2();
       
       /*try{                  when we have to pause main thread we use try caught in main
        t.sleep(10000);
       }
       catch(Exception e){
        e.printStackTrace();
       }*/
 t.start();
 t2.start();
       
    /*    try{
            t.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
         t2.start();*/
    }
}
class thre1 extends Thread{
    public void run(){
        int i=0;
        while(i<2){
            System.out.println("Thre1 is running"); 
             i++;
             try{                 // when inside thread we have to handle something we use try caught inside class
                Thread.sleep(10000);
             }
             catch(Exception e){
                e.printStackTrace();
             }
        }
       
    }
}

class thre2 extends Thread{
    public void run(){
        System.out.println("Thread2 running");
    }
}