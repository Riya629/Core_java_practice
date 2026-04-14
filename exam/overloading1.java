package home.exam;

public class overloading1 {
    public static void main(String[] args) {
        student4 s= new student4();
        s.display("Riya");
        s.display(20,1);
        s.display(55.5f, 5.5f);
    }
}
class student4{
    String name;
    int age;
    int id;
    float weight;
    float height;

    public void display(String name){
        this.name=name;
        System.out.println(name);
    }

    public void display(int age, int id){
        this.age=age;
        this.id=id;
        System.out.println(age);
        System.out.println(id);
    }

    public void display(float height, float weight){
        this.height=height;
        this.weight=weight;
        System.out.println(height);
    System.out.println(weight );
    }
}