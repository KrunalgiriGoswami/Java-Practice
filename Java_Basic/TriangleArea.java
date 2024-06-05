import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        float base, height, area;
        System.out.println("Enter the base of the triangle: ");
        base = sc.nextFloat(); // Read user input as float
        System.out.println("Enter the height of the triangle: ");
        height = sc.nextFloat(); // Read user input as float

        // Calculate area
        area = (base * height) / 2;

        // Display result
        System.out.println("Area of the triangle: " + area);
    }
}
