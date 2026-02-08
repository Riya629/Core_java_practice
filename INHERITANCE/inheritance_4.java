package home.INHERITANCE;

public class inheritance_4 {
    public static void main(String[]args){
derivedd d1= new derivedd();
derivedd d2= new derivedd(2,3); //when we use constructor then if we create the obj of derived class the base class is also run at first base class and then derived class is run
    }
}
class Basse{
Basse(){  //Default constructor
    System.out.println("This is base class");
} 

Basse(int x){
System.out.println("This is parameterized constructor" +x);
}
}
   class derivedd extends Basse{
    derivedd(){
        super(1);  //It run the paramertized constructor of base class
        System.out.println("This is derived class");
    }

    derivedd(int x , int y){
        System.out.println("This is parameterized constructor of derivedd class"+x+y);
    }
   }