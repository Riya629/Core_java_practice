package home.method;
//Method overloading by creating an object 
public class method_overloading_7 {
    public static void main(String args[]){
method_overloading_7 m= new method_overloading_7();
m.display();
m.display(2.1, 5.5);
m.display(99.5,55.3);
    }

    void display(){
        String name="Riya";
        int age=20;
        System.out.println(name);
        System.out.println(age);
    }
    void display(float id, float height){
        System.out.println(id);
        System.out.println(height);
    }
    void display(double marks, double weight){
        
        System.out.println(marks);
        System.out.println(weight);
    }
}
