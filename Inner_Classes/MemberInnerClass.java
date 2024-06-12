class OuterClass {
    private String message = "Hello from the Outer class!";

    class InnerClass {
        void display() {
            System.out.println(message); // Accessing private member of OuterClass
            System.out.println("hello from inner class!");
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
