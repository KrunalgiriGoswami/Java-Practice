import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        // Display result
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");
    }
}
