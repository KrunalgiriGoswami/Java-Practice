package Java_Basic;

import java.util.Scanner;

public class RectanglePerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        float length, width, perimeter;
        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextFloat();
        System.out.println("Enter the width of the rectangle: ");
        width = sc.nextFloat(); // Read user input as float

        // Calculate perimeter
        perimeter = 2 * (length + width);

        // Display result
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
