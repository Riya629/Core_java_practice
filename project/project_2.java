package home.project;
import java.util.Random;
import java.util.Scanner;

public class project_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        game1 g = new game1(sc);

        boolean b = false;

        while (!b) {
            g.takeuserinput();
            g.SetNoofGuesses(g.getNoofGuesses() + 1);
            b = g.iscorrect();
        }

        System.out.println("You guessed the number in " + g.getNoofGuesses() + " attempts.");

        sc.close();  
    }
}

class game1 {

    int originalNumber;
    int NoofGuesses = 0;
    int UserNumber;
    Scanner sc;

    game1(Scanner sc) {
        this.sc = sc;
        Random ran = new Random();
        this.originalNumber = ran.nextInt(100);
    }

    void takeuserinput() {
        System.out.println("Enter the number");
        UserNumber = sc.nextInt();
    }

    void SetNoofGuesses(int NoofGuesses) {
        this.NoofGuesses = NoofGuesses;
    }

    int getNoofGuesses() {
        return NoofGuesses;
    }

    boolean iscorrect() {

        if (UserNumber == originalNumber) {
            System.out.println("Correct number!");
            return true;
        } else if (UserNumber < originalNumber) {
            System.out.println("Number is smaller than original number");
            return false;
        } else {
            System.out.println("Number is greater than original number");
            return false;
        }
    }
}