import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1 or less are not prime
        }
        //check for divisibility only up to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // Prime number
    }
}
