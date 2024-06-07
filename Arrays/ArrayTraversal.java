package Arrays;
import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Declare the array
        int[] array = new int[size];

        System.out.println("The Size of Array is: " + size);

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int j = 0; j < size; j++) {
            System.out.println(array[j] + " ");
        }
    }

}
