package home.project;
import java.util.Random;
import java.util.Scanner;
public class project_2 {
    public static void main(String[]args){
game1 g = new game1();
boolean b= false;
while(!b){
    g.takeuserinput();
g.SetNoofGuesses(g.getNoofGuesses()+1);
     b = g.iscorrect();
}
System.out.println("You guessed the number in " + g.getNoofGuesses() + " attempts.");

    }
}
class game1{
    int originalNumber;
    int NoofGuesses=0;
    int UserNumber;
    game1(){
Random ran= new Random();
this.originalNumber=ran.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        UserNumber=sc.nextInt();
     
        
    }
    void SetNoofGuesses(int NoofGuesses){
      this. NoofGuesses=NoofGuesses;
    }
    int getNoofGuesses(){
        return NoofGuesses;
    }
    boolean iscorrect(){
     
if(UserNumber==originalNumber){
    System.out.println("The number you have entered matched with original number/ Correct..");
    return true;
}
else if(UserNumber<originalNumber){
System.out.println("The  number you have entered is smaller then original number...");
return false;
}
else if(UserNumber>originalNumber){
    System.out.println("The number you have entered is greater than original number....");
    return false;
}
else{
    return false;
}
    }
}