package home.EXCEPTION;

import java.util.Scanner;

//Handling multiple Exception
public class multiple_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of subject");
        n = sc.nextInt();
        int[] marks = new int[n];
        /*
         * marks[0]=60;
         * marks[1]=70;
         * marks[2]=80;
         */
        System.out.println("Enter the marks");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the index number");
        int ind = sc.nextInt();
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try {
            System.out.println("The number at index is:" + marks[ind]);
            System.out.println("The divison is" + marks[ind] / num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception due to:");
            System.out.println(e);

        } catch (ArithmeticException e) {
            System.out.println("Exception due to:");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception due to:");
            System.out.println(e);
        }
        System.out.println(marks[ind]);
        System.out.println(num);
    }
}
