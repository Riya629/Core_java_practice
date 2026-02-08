package home.INHERITANCE;

public class super_ex {
    public static void main(String[]args){
demo2 d=new demo2();
d.display();
    }
}
class demo1{
    public void demo(){
       
        System.out.println("This is method of parent class");
    }
}
class demo2 extends demo1{
    public void demo(){
       
        System.out.println("This is the demo of child class");
    }
    public void display(){
        demo();
        super.demo();  //without this the parent method will be called and printed so in method super is used to called the parent methdo
    }
} //we cannot use super keyword in main class so we create seperate method to call it in userdefine class not in main class