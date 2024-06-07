import java.util.Scanner;

public class ElementOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Declare the array
        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to search for
        System.out.println("Enter the element to find its occurrences:");
        int target = scanner.nextInt();

        // Count occurrences of the element
        int occurrences = countOccurrences(array, target);

        // Display the result
        System.out.println("Number of occurrences of " + target + " in the array: " + occurrences);
    }

    // Method to count occurrences of an element in an array
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
