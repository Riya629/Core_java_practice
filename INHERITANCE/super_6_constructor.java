package home.INHERITANCE;
//parameterized constructor using super keyword
public class super_6_constructor {
    public static void main(String[]args){
//construct3 c=new construct3(50);
construct3 c= new construct3();
    }
}
class construct2{

    construct2(){

        System.out.println("This is default constuctor");
    }
    construct2(float x){

        System.out.println("This is parent class parameterized constuctor");
    }
}
class construct3 extends construct2{
    construct3(){
       
System.out.println("This is default constructor of derived class");
    }
    construct3(float x){
        super(x);
System.out.println("This is parametrized constructor");
    }
}