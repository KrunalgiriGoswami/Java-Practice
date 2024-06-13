package Abstraction;

abstract class Animal4 {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog4 extends Animal4 {
    public void sound() {
        System.out.println("Woof");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Dog4 myDog = new Dog4();
        myDog.sound(); // Output: Woof
        myDog.sleep(); // Output: Sleeping...
    }
}
