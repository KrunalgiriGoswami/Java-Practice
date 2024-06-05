import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the principal amount (P): ");
        float principal = sc.nextFloat();
        System.out.print("Enter the rate of interest (R) in percentage: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the time period (T) in years: ");
        float time = sc.nextFloat();

        // Calculate simple interest
        float interest = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest (SI) = " + interest);
    }
}
