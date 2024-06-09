import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        mulTable();
    }

    public static int mulTable(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the table of your choice: ");
        int num = sc.nextInt();

        int limit = 10; // Change this to define the multiplication range

        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        return 0;
    }
}
