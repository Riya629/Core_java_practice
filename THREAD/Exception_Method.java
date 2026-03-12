package home.THREAD;
import java.util.Scanner;
public class Exception_Method {
    public static void main(String[] args) {
          Scanner sc= new Scanner (System.in);
          int num;
          MyException m= new MyException();
          System.out.println("Enter a number");
          num=sc.nextInt();
           System.out.println(m.toString()); //We can to in this way too
            System.out.println(m.getMessage());
            System.out.println(m);
          try{
            if(num<9){
               // throw new MyException();
               throw new ArithmeticException("This is arthmetic exception");
            }

          }
          catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
          }
    }
}
class MyException extends Exception{
  
    public String toString(){
return "This is exception 1";
    }
    public String getMessage(){
return "This is getmessage()";


    }
}