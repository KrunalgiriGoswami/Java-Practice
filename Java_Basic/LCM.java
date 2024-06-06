import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int lcm = calculateLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);

    }

    public static int calculateLCM(int num1, int num2) {
        // Find the greatest common divisor (GCD) first
        int gcd = findGCD(num1, num2);

        // LCM is simply the product of the two numbers divided by their GCD
        return (num1 * num2) / gcd;
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2); //GCD calculation using Euclid's Algorithm
    }
}
