package home.INHERITANCE;
//Example of this in constructor
public class this_2_constructor {
    public static void main(String[]args){
construct c= new construct("riya");
c.display();
    }
}
class construct{
    String name;
    construct(String name){
this.name=name;
    }
    void display(){
        System.out.println("This is an example of this used in constructor");
    }
}