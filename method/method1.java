package home.method;

public class method1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        int c;
        c = sum(a, b); //function call

        System.out.println(c);
    }

    static int sum(int x, int y) {
        int z = x + y;
        return z;

    }

    
}
/*
 * //method class using object
 * int sum(int x, int y){
 * 
 * int z=x+y; //
 * return z;
 * 
 * 
 * }
 * public static void main(String[]args){
 * method1 obj=new method1();
 * int a=2;
 * int b=1;
 * int c;
 * c=obj.sum(a,b);
 * System.out.println(c);
 * }
 * }
 */