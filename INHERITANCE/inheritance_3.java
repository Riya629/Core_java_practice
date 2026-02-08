package home.INHERITANCE;

public class inheritance_3 {
    public static void main(String[]args){
        //creating the parent class object and accessing it
parent p =new parent();
p.setnum(5);
System.out.println(p.getnum());

//creating the child class object and accessing parent class properties
child c = new child();
c.setnum(3);
System.out.println(c.getnum());
c.setnumb(7);
System.out.println()

    }
}
class parent{
    int num;
    void setnum(int n){
        num=n;
    }
    int getnum(){
        return num;
    }
}
class child extends parent{
    int numb;
    void setnumb(int nu){
numb=nu;
    }
    int getchild(){
        return numb;
    }
}