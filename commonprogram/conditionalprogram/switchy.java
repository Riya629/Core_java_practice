package home.commonprogram.conditionalprogram;

import java.util.Scanner;

public class switchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        char op;
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        System.out.println("Enter the operator + - / * ");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("sum is" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("subis" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("multiply is" + result);
                break;
            case '/':
                if (num1 <= 0) {
                    System.out.println("syntax error");
                } else {
                    result = num1 / num2;
                    System.out.println("division is" + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }

}
