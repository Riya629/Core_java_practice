package home.method;

//Method overloading
public class method_overloading {
    /*
     * static void telljoke(){
     * System.out.println("I invented a new word!\n" + "plagiarism");
     * }
     * public static void main(String[] args) {
     * telljoke();
     */
    static void foo() {
        System.out.println("Good morning bro" );
        System.out.println("\n");
    }

    static void foo(int a) {
        System.out.println("Good morning" + a + "bro");
             System.out.println("\n");
    }

    static void foo(int a, int b, int c) {
        System.out.println("Good morning" +" " +a+ " " +b + " "+c+ "bro");
             System.out.println("\n");
    }

    public static void main(String[] args) {
       /*  int a = 20;
        int b = 30;
        int c = 40;*/
        // calling methods
        foo();
        foo(20);
        foo(30 ,40 ,50);
    }
}
