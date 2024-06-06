import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        sumOfEvenNumbers();
    }

    public static int sumOfEvenNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i += 2){
            sum+=i;
        }

        System.out.println("The Sum Of Even Numbers From 1 to "+ n + " is: "+sum);

        return 0;
    }
}
