import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is an Armstrong number:");
        int num = sc.nextInt();

        boolean result = armstrongNumberChecker(num);

        if (result) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean armstrongNumberChecker(int num) {
        int r, arm = 0;
        int c = num;
        while (num != 0) {
            r = num % 10;
            arm = (r * r * r) + arm;
            num /= 10;
        }
        return c == arm;
    }
}

