import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        sumOfOddNumbers();
    }

    public static int sumOfOddNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i += 2){
            sum+=i;
        }

        System.out.println("The Sum Of odd Numbers From 1 to "+ n + " is: "+sum);

        return 0;
    }
}
