import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;
        int maxAttempts = 10;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        System.out.println("You have a maximum of " + maxAttempts + " attempts.");
        
        // Loop until the user guesses the number correctly or runs out of attempts
        while (userGuess != numberToGuess && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
            
            if (attempts >= maxAttempts && userGuess != numberToGuess) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
            }
        }
        
        scanner.close();
    }
}
