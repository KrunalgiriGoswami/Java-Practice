import java.util.Scanner;

public class AgeCategorizer {

    public static void main(String[] args) {

        // Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Categorize age group
        String category;
        if (age >= 0 && age <= 2) {
            category = "Baby";
        } else if (age >= 3 && age <= 12) {
            category = "Child";
        } else if (age >= 13 && age <= 18) {
            category = "Teenager";
        } else if (age >= 19 && age <= 60) {
            category = "Adult";
        } else {
            category = "Senior";
        }

        // Display result
        System.out.println("You are categorized as: " + category);
    }
}
