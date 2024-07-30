package Generics;

public class WrapperClass {
    public static void convertion(){
        // Autoboxing & Unboxing

        int num = 5;
        Integer numObj = num; // Autoboxing
        int newNum = numObj; // Unboxing

        System.out.println("Autoboxing :" + numObj);
        System.out.println("Unboxing :" + newNum);

    }

    public static void objMethod(){

        int num = 5;
        Integer numObj = Integer.valueOf(num); // Wrapped in Integer object

        System.out.println(numObj);

        // Using a method from the Integer class
        int maxNum = Integer.max(10, 20);
        System.out.println(maxNum);

    }

    public static void main(String[] args) {
        convertion();
        objMethod();
    }
}
