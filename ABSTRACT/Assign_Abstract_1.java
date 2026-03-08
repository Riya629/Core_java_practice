package home.ABSTRACT;

public class Assign_Abstract_1 {
    public static void main(String[]args){
/*
we can create the reference od abstract class but we cannot create the object of it
pen p = new Doms();
p.write();
p. refill();*/ 
Doms d= new Doms();
d.write();
d. refill();
    }
}
 abstract class pen{
    abstract void write();
    abstract void refill();
}
class Doms extends pen{
    void write(){
        System.out.println("This pen write smootly");
    }
    void refill(){
        System.out.println("we can also refill the pen");
    }
}