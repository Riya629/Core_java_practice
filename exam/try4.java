package home.exam;

public class try4 {
    public static void main(String[] args) {
        //excep e = new excep();
        int age=12;
        try{
            if(age<18){
                throw new excep();
            }
        
            else{
                System.out.println("Eligible to vote");
            }
        }
            catch(excep e){
                System.out.println(e.toString());
            }
        }
    }

class excep extends Exception{
    public String toString(){
       return "Not eigible to vote";
    }
}