public class OperatorDemo {

    public static void main(String[] args) {

        // Arithmetic operators
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer result)
        System.out.println("a % b = " + (a % b)); // Modulo (remainder)

        // Assignment operator
        int c = 20;
        c += 3; // Equivalent to c = c + 3
        System.out.println("c = " + c);

        // Relational operators
        boolean isGreater = a > b;
        System.out.println("a is greater than b: " + isGreater); // True
        System.out.println("a is equal to b: " + (a == b)); // False

        // Logical operators
        boolean isEven = (a % 2 == 0) && (b % 2 == 0);
        System.out.println("a and b are even: " + isEven); // False
        boolean isOdd = (a % 2 != 0) || (b % 2 != 0);
        System.out.println("a or b is odd: " + isOdd); // True

        // Unary operators (demonstrating increment)
        int count = 0;
        count++; // Pre-increment (increment then assign)
        System.out.println("count = " + count); // Output: 1

    }
}
