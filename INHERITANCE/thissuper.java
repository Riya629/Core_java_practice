package home.INHERITANCE;

public class thissuper {
    public static void main(String[]args){
class1 c= new class1(5);
System.out.println(c.getnum());
    }
}
class class1{
    int num;
    class1(int num){
this.num=num;   //this.name=object variable and num=parameter passed to constructor
    }
    int getnum(){
        return num;
    }
    public int returnone(){
        return 1;
    }
}