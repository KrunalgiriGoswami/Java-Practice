// નમઃ સિદ્ધમ
package Loops;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to set your Password: ");

        String password;
        do {
            System.out.println("Please Enter Your Password: ");
            password = sc.next();
        } while (!isValidPassword(password));

        System.out.println("Thanks For Entering Valid Password");
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 8;
    }
}
