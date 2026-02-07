package home.constructor;
//Constructor overloading
public class constructor_overloading {
    public static void main(String[]args){
Myperson mp= new Myperson();
Myperson mp2= new Myperson("sachet", 26);
Myperson mp3 =new Myperson("pabitra", 30, 5.5f);  //for float f should be written otherwise the java will thought it as a double
mp.display();
mp2.display();
mp3.display();
    }
}
//User defined class
class Myperson{
    String name;
    int age;
    float weight;


    Myperson(){                   //Default constructor
        name="Ria";
       age=20;
    } 

//parametrized constructor 
    Myperson(String n, int a){   // with 2 parameters
        name=n;
        age=a;
    } 

    Myperson(String n, int a, float w){  //with 3 parameters
        name=n;
        age=a;
        weight=w;
    }

    //Method creating
    void display(){
        System.out.println(name);
System.out.println(age);
    }
}