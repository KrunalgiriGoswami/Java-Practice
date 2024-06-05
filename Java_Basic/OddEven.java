import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Check if even using modulo operator
        boolean isEven = (number % 2 == 0);

        if (isEven) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
