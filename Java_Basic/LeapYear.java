import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        // Display result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
