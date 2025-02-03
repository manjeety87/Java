///// Add any necessary imports here
// import.java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("** GUESSING GAME **");
        Random random = new Random();
        ///// Write code to generate the random number to guess here
        int randomNumber = random.nextInt(100) + 1;

        ///// Write code to create two Player objects here
        Player manjeet = new Player();
        Player computer = new Player();

        while (true) { // Loop until 'break'
            ///// Start of code for human
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your guess between 1 to 100: ");
            int playerGuess = input.nextInt();
            manjeet.incrementGuesses();

            if (playerGuess == randomNumber) {
                System.out.println("You guessed it right! the number is " + randomNumber);
                break;
            } else if (playerGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }

            ///// Start of code for computer
            int computerGuess = computer.computerGuess();
            System.out.println("Computer guessed " + computerGuess);
            computer.incrementGuesses();

            if (computerGuess != randomNumber) {
                System.out.println("Computer guessed it wrong. Try again.");
            }
            if (computerGuess == randomNumber) {
                System.out.println("Computer guessed it right! the number is " + randomNumber);
                break;
            } else {
                if (computerGuess > randomNumber) {
                    computer.computerGuessWasWrong(true);
                } else {
                    computer.computerGuessWasWrong(false);
                }
            }

        } // End of 'while' loop

    } // End of the main method

}
// End of GuessingGame class