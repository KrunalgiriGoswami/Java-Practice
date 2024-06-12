interface Greeting {
    void greet();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("Hello from the Anonymous Inner class!");
            }
        };
        greeting.greet();
    }
}
