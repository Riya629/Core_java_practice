package home.exam;

public class try2 {
    public static void main(String[] args) {
    
    try{
        int c=10/0;
        System.out.println(c);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}