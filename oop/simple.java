package home.oop;
 
public class simple {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employe riya=new Employe();     //Instantiating a new employee object

        //setting atrribute or properties
riya.id=12;
riya.name="Riya";

//printing attributes
riya.printdetail();
       

      //  System.out.println(riya.id);
      //  System.out.println(riya.name);
    }
   
}
 class Employe{       //In one java file there will be only one public class
    int id;
    String name;
 public void printdetail(){
        System.out.println(id);
        System.out.println(name);
    }
}
