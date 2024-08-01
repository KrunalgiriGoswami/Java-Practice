package Java_Basic;

public class DataTypesDemo {

    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 100;
        short shortVar = 1000;
        int intVar = 10000;
        long longVar = 100000L;
        float floatVar = 10.5f;
        double doubleVar = 100.5;
        char charVar = 'A';
        boolean booleanVar = true;

        // Non-primitive data types
        String stringVar = "Hello, World!";
        int[] intArray = {1, 2, 3, 4, 5};
        DataTypesDemo objectVar = new DataTypesDemo();

        // Printing all the variables
        System.out.println("Byte Variable: " + byteVar);
        System.out.println("Short Variable: " + shortVar);
        System.out.println("Integer Variable: " + intVar);
        System.out.println("Long Variable: " + longVar);
        System.out.println("Float Variable: " + floatVar);
        System.out.println("Double Variable: " + doubleVar);
        System.out.println("Character Variable: " + charVar);
        System.out.println("Boolean Variable: " + booleanVar);
        System.out.println("String Variable: " + stringVar);
        System.out.print("Integer Array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Object Variable: " + objectVar);
    }
}
