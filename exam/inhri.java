package home.exam;

public class inhri {
    public static void main(String[] args) {
        doggg g= new doggg();
        g.eat();
        g.bark();
    }

}
class anni{
    public void eat(){
        System.out.println("Animal eat......");
    }
}
class doggg extends anni{
    public void bark(){
        System.out.println("barks");
    }
}