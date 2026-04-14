package home.exam;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1;
        int num2;
        char op;
        int result;
        System.out.println("Enter two number");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Enter operator");
        op=sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println(result=num1+num2);
                break;
                case '-':
                    System.out.println(result=num1-num2);
                    break;
                    case '*':
                        System.out.println(result=num1*num2);
                        break;
                        case'/':
                        if(num2!=0){
                            System.out.println(result=num1/num2);
                        }
                        else{
                            System.out.println("errror....");
                        }
                        break;
                        default:
                            System.out.println("Invalid operator");
        }
    }
}
