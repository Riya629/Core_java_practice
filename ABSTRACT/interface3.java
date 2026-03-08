package home.ABSTRACT;

public class interface3 {
    public static void main(String[]args){
MySampleclass msc= new MySampleclass(); //Dynamic method dispatch
msc.meth1();
msc.meth2();
msc.meth3();
msc.meth4();
    }
}
interface SampleInterface{   //parent interface 
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{ 
     //child interface we can extends the parent interface but class only implements the interface
    void meth3(); //although here is no meth1 and meth2 but it inherit from parent interface so we must implement the parent interface method if child interface inherits the parent interface and the class implenet the child interface
    void meth4();
}
class MySampleclass implements ChildSampleInterface{
 public void meth3(){
    System.out.println("meth3");
}
public void meth4(){
System.out.println("meth4");
}
public void meth1(){
    System.out.println("meth1");
}
public void meth2(){
    System.out.println("meth2");
}
}