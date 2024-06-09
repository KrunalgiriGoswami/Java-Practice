import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Number Checker");
        System.out.println("Enter a First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a Second Number: ");
        int num2 = sc.nextInt();

        // Ternary Opertor
        int gretestNumber = num1 > num2 ? num1 : num2;
        System.out.println(gretestNumber + " is Gretest Number");
    }
}
