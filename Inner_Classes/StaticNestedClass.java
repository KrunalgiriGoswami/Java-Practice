class OuterClass1 {
    private static String message = "Hello from the Outer static class!";

    static class StaticNestedClass {
        void display() {
            System.out.println(message); // Accessing static member of OuterClass
            System.out.println("hello from the static inner class!");
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass1.StaticNestedClass nested = new OuterClass1.StaticNestedClass();
        nested.display();
    }
}
