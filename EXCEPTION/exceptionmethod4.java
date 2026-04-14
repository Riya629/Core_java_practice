package home.EXCEPTION;
import java.util.Scanner;

//Demostarating the custom exception
public class exceptionmethod4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        try{
            if(n==0){
throw new Myexception(); // this print the catch block if you enter 0
            }
            else{
                System.out.println("you entered valid number"); //if you entered other number this is printed
            }
        }
        catch(Myexception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
class Myexception extends Exception{
    public String toString(){
        return "Iam custom exception1";
    }
    public  String getMessage(){
        return "Iam exception 2";
    }
    public void printStackTrace(){
        System.out.println("Iam exception 3");
    }
}