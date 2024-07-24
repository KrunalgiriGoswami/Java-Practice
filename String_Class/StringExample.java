import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println(name.length());

        System.out.println(name.charAt(0));
    }
}
