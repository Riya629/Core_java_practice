package home.exam;

public class protected1 {
    public static void main(String[] args) {
        demo3 d= new demo3();
        d.detail("Riya");
    }
}
class demo3{
    protected String name;
 protected void detail(String name){
        this.name=name;
        System.out.println(name);
    }
}