package home.project;

import java.util.Scanner;

//Guess the number game
public class project_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game g = new game();
        System.out.println("please enter number between 0-200");
        for (int i = 0; i <= 200; i++) {
            System.out.println("Enter the number");
            g.num = sc.nextInt();

            g.setnoofguesses(i);

            if (g.num < g.correctnum) {
                g.takeusersmaller();
            } else if (g.num > g.correctnum) {
                g.takeuserlarger();
            } else if (g.num == g.correctnum) {
                g.takeusercorrect();
                break;
               
            } 
        }
        sc.close();
    }
}

class game {
    int num;
    private int noofGuesses;
    int correctnum;

    game() {
        correctnum = 50;
    }

    void setnoofguesses(int ng) {
        noofGuesses = ng;
    }

    int getnoofguesses() {
        return noofGuesses;
    }

    void takeusersmaller() {
        System.out.println("The number is smaller");
    }

    void takeuserlarger() {
        System.out.println("The number is Greater");
    }

    void takeusercorrect() {
        System.out.println("The number is correct");
    }

    

}