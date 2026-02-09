package home.method;
//Example of static variable
public class static_varibale {
    public static void main(String[]args){
stati s1= new stati();
stati s2 = new stati();
s1.name="Riya";
s2.name="sachet";
s1.display();
s2.display();
  System.out.println(stati.college);
    }
}
class stati{
    static  String college="ABC COLLEGE";//initailization at declaration
   
    String name; 

    void display(){
       
        System.out.println(name);
    }
}