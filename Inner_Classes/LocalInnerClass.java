class OuterClass2 {
    void display() {
        String message = "Hello from the local Outer class!";
        class LocalInnerClass {
            void printMessage() {
                System.out.println(message); // Accessing local variable of method
                System.out.println("hello from the local inner class!");
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.printMessage();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.display();
    }
}
