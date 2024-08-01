package Java_Basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is Your Name : ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + " Welcome to JAVA Programing...");
    }
}
