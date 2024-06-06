import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to calculate the sum of digits
        int sum = sumOfDigits(number);

        // Output the result
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }

    // Method to calculate the sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;

        // Loop to extract digits and add to sum
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }
}
