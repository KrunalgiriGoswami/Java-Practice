import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a number to reverse its digits:");
        int num = scanner.nextInt();

        // Reversing the number
        int reversed = reverseNumber(num);

        // Displaying the result
        System.out.println("The reversed number is: " + reversed);
    }

    // Method to reverse the digits of a number
    public static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
