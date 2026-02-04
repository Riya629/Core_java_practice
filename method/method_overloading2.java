package home.method;

public class method_overloading2 {
    
    public static void main(String[]args){
        student("Riya");
        student("Riya", 20);
        student("Riya", 20, 50);
    }

static void student(String name){
        System.out.println("Name of student is"+name);
    }
    static void student(String name, int age){
        System.out.println("name is"+" "+name+ " "+ "age is"+""+age);
    }
     static void student(String name, int age, int weight){
        System.out.println("name is"+" "+name+ " "+ "age is"+""+age+" "+ "weight is"+ " " +weight);
     }
}