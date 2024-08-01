import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        System.out.println("Enter Your Birth Date:");
        int date = cIn();
        System.out.println("Enter Your Birth Month:");
        int month = cIn();
        System.out.println("Enter Your Birth Year:");
        int year = cIn();

        System.out.println("Your Date Of Birth Is "+date+"/"+month+"/"
        +year);

    }

    public static int cIn() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        return num;
    }
}
