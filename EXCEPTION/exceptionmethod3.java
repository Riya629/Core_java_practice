package home.EXCEPTION;
import java.util.Scanner;
public class exceptionmethod3 {
    //Demostrating the inbuilt exception
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        try{
            if(num<18){
                throw new ArithmeticException("you cannot vote");
            }
            else{
                System.out.println("You can vote");
            }
        }
        catch(ArithmeticException e){
            System.out.println("The reason of the exception is:");
            System.out.println(e);  //It print you cannot vote
        }
    }
}
