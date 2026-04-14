package home.exam;

public class private1 {
   
public static void main(String[] args) {
    demo1 d= new demo1();
    d.setage(20);
    System.out.println(d.getage());
    d.setname("Riya");
    System.out.println(d.getname());
}
}
class demo1{
    private int age;
private String name;
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}