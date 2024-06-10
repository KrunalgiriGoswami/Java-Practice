import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int randomNumber = (int)(Math.random() * 10) + 1;

        // Variable to store the user's guess
        int guess = 0;

        // Game loop
        while (guess != randomNumber) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess (1-10): ");
            guess = scanner.nextInt();

            // Check if the guess is too low, too high, or correct
            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
