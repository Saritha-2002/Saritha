
1.Guess an integer in a range

import java.util.*;
public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        boolean guessed = false;
        int randInt = rand.nextInt(10000) + 1;

        System.out.println("Guess my number. It's between 1 and 10,000.");

        while (!guessed) {
            int guess = 0;
            do {
                if(!scan.hasNextInt()) {
                    String notInt = scan.next();
                    System.out.printf("%s is not an integer.\n", notInt);
                }
                else
                    guess = scan.nextInt();
            }while (guess == 0);

            if(guess > randInt) {
                System.out.println(guess + " is too high.");
            }
            else if(guess < randInt) {
                System.out.println(guess + " is too low.");
            }
            else if (guess == randInt) {
                System.out.println(guess + " is the number!");
                guessed = true;
            }

        }
    }

}



