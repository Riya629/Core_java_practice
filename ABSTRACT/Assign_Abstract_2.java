package home.ABSTRACT;
//next program with additional method
public class Assign_Abstract_2 {
    public static void main(String[]args){
fountainpen fp = new fountainpen();
fp.changenib();
fp.write();
fp.refill();
    }
}
 abstract class pen2{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen2{
    void write(){
        System.out.println("The pen writes smootly");
    }
    void refill(){
        System.out.println("we can refill this pen");
    }
    void changenib(){
        System.out.println("change the nib of pen");
    }
}