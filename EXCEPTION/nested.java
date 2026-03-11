package home.EXCEPTION;

public class nested {
    public static void main(String[] args) {
        int[]marks=new int[3];
        marks[0]=20;
        marks[1]=40;
        marks[2]=60;
        try{
            System.out.println("This is nested try-catch");
        try{
            System.out.println(marks[9]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Good morning:");
            System.out.println("Exception in nested try");
        }
    }
        catch(Exception e){
            System.out.println(e);
        }
    
    }
}
