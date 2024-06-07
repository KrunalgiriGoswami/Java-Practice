import java.util.Scanner;

class Addition {
    int sum = 0;

    public int addTwoInt(int a, int b) {
        sum = a + b;
        return sum;
    }
}

public class JavaMethods {
    public static void main(String[] args) {
        Addition add = new Addition();
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        int s = add.addTwoInt(num1, num2);

        System.out.println("Sum of two integer values: " + s);

    }
}
