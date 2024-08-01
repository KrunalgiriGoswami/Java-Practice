import java.util.Scanner;

public class NumberSign {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Determine number sign
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}
