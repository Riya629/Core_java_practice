package home.exam;

public class superdata {
    public static void main(String[] args) {
        sup2 s = new sup2();
        s.display();
    }
}
class sup1{
    int num=10;
}
class sup2 extends sup1{
    int num=20;
    public void display(){
        System.out.println(super.num);
    }
}