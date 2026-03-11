package home.EXCEPTION;
//Demonstrating the runtime exception i.e. Airthmetic exception
public class try_catch1 {
    public static void main(String[] args) {
       /* int a=20;
        int b=0;
        int c=a/b;//Throws an exception and it didnt print anything because once the exception is founf and if it is not handled then remaining line of code are not prinyted it ended over there
        System.out.println("Program ended"); */


        int a=20;
        int b=0; //if b=2 then result=20 will be printed
        try{
        int c=a/b;
        System.out.println(c); //Any thing wriiten inside the try maythrow exception it is checked and if it throe excepion then  the program jumo to catch if no exception then catch block is skip
        }
        catch(Exception e){
            System.out.println("Arithmetic exception catch:Reason:");
           System.out.println(e);  //this print the actual exception
        }
        System.out.println("program ended..");//this line is printed because the exception is handel using try catch
    }
}
