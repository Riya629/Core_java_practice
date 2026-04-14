package home.exam;

public class constructor2 {
    public static void main(String[] args) {
       cons2 c= new cons2(2); 
    }
}
class cons1{
    cons1(){
        System.out.println("This is default base class");
    }
    cons1(int x){
        System.out.println("This is parametrize base class");
    }
}
class cons2 extends cons1{
    cons2(){
        System.out.println("This is default child class");
    }
    cons2(int x){
       
        System.out.println("This is parameterized child class");
    }
}