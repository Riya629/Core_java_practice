package home.THREAD;
import java.util.Scanner;
public class Exception_method2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter age");
        age=sc.nextInt();

        try{
            if(age<18){
              //  throw new ArithmeticException("You are not eligible to vote");
        //      throw new ArithmeticException();
         throw new Myexception2() ; //throw inbuilt exception i.e. airthmetic exception
            }
            else{
                System.out.println("Yout are eligible to vote");
            }
        }
        catch(Myexception2 e){  //catch custom exception exception
            System.out.println(e);
          
        }
       
    }
}
class Myexception2 extends Exception{
    public String toString(){
       return "This is tostring method()";
    }
    public String getMessage(){
        return "This is getMesaage method()";
    }
}