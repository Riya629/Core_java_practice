package home.THREAD;
//Using thread printing good morning and welcome
public class Assign_thread1 {
    public static void main(String[] args) {
        ThreadFirst tf= new ThreadFirst();
        
        ThreadFirst2 tf2= new ThreadFirst2();
        tf.start();
        tf2.start();
    }
}
class ThreadFirst extends Thread{
    public void run(){
        int i=0;
        while(i<2){
        System.out.println("Good morning");
        i++;
    }
}
    
}
class ThreadFirst2 extends Thread{
public void run(){
    int i=0;
    while(i<2){
    System.out.println("Welcome");
    i++;
}
}
}
