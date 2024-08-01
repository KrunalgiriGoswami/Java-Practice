import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        long result = factorial(number);
        System.out.println("The Factorial of "+ number + " is :" + result);
    }

    public static long factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
