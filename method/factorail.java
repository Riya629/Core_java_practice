package home.method;
import java.util.Scanner;
public class factorail {
    static int fact(int n){
        if(n==0||n==1){
           return 1;
        }
        else {
            return n*fact(n-1);
    }
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the number");
    n=sc.nextInt();
fact(n);
System.out.println("The factorial of given  number is " +fact(n));
sc.close();
}
}