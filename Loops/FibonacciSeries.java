import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number of terms to print in the Fibonacci series:");
        int n = scanner.nextInt();

        // Printing the Fibonacci series
        printFibonacci(n);
    }

    // Method to print the Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
