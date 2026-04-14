package home.EXCEPTION;

public class Throws1 {
    public static void main(String[] args) {
THROWS T = new THROWS();
       try{
       T. area(-1);
       }
       catch(ArithmeticException e){
System.out.println(e);
       }
        }
    }

class THROWS{
public void area(int r) throws  ArithmeticException{
    
    if(r<0){
    throw new ArithmeticException("Radius cannot be negative");
    }
    else{
        double result=Math.PI*r*r;
    }
    
  
    
}
}
