package home.exam;

public class try1 {
   public static void main(String[] args) {
    demo d= new demo();
    try{
d.check(12);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
   } 
}
class demo{
    public void check(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }
        else{
            System.out.println("eligible");
        }
    }
}