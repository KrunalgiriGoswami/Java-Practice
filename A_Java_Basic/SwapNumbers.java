package Java_Basic;

public class SwapNumbers {

    public static void main(String[] args) {

        // Numbers to swap
        int x = 10;
        int y = 20;

        // Method 1: Using a temporary variable
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping (Method 1):");
        System.out.println("x = " + x); // Output: 20
        System.out.println("y = " + y); // Output: 10

        // Method 2: Using arithmetic operators
        x = x + y;  // x becomes 30 (10 + 20)
        y = x - y;  // y becomes 10 (30 - 20)
        x = x - y;  // x becomes 20 (30 - 10)

        System.out.println("\nAfter swapping (Method 2):");
        System.out.println("x = " + x); // Output: 20
        System.out.println("y = " + y); // Output: 10

    }
}
