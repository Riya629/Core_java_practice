package home.exam;
import java.util.Scanner;
public class class1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        car c= new car();
        System.out.println("Enter the car number");
        c.number=sc.nextInt();
        sc.nextLine();
         System.out.println("Enter the car name");
        c.name=sc.nextLine();
         System.out.println("Enter the car model");
        c.model=sc.nextLine();
         System.out.println("Enter the car color");
        c.color=sc.nextLine();
         System.out.println("Enter the car fuel");
        c.fuel=sc.nextLine();
         System.out.println("Enter the car price");
        c.price=sc.nextInt();
        c.display();
        
    }
}
class car{
    int number;
    String name;
    String model;
    String color;
   String fuel;
    int price;
    public void display(){
        System.out.println("The car details are:");
        System.out.println(number);
        System.out.println(name);
        System.out.println(model);
         System.out.println(color);
        System.out.println(fuel);
        System.out.println(price);
    }

}