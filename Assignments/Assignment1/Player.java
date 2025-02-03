
public class Player {
    ///// Declare field variables here
    public int numOfPlayers;
    public int numOfGuesses; 

    ///// Write method(s) here
    public void incrementGuesses(){
        numOfGuesses++;
    }


    /*** Start of guessing logic for the computer player, do not change any code below ***/
    private class Inner {
        static int lastGuess;
        static int high = 100;
        static int low = 1;
    }

    // Calculate and return the computer player's next guess.
    public int computerGuess() {
        int guess = (Inner.low + Inner.high)/2;
        Inner.lastGuess = guess;
        return guess;
    }

    // Method to tell the computer player about wrong guesses.
    // Parameter value 'true' means the guess was too high,
    // 'false' means the guess was too low. 
    public void computerGuessWasWrong(boolean highLow) {
        if (highLow) {
            // The guess was too high
            Inner.high = Inner.lastGuess - 1;
        }
        else {
            // The guess was too low
            Inner.low = Inner.lastGuess + 1;
        }
    }
} // End of Player class
