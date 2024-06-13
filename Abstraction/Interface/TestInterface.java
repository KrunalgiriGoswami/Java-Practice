package Abstraction.Interface;

interface Animal5 {
    void sound();
    void sleep();
}
class Dog5 implements Animal5 {

    @Override
    public void sound() {
        System.out.println("Wohhh...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
}
public class TestInterface {
    public static void main(String[] args) {
        Dog5 mydog = new Dog5();

        mydog.sound();
        mydog.sleep();
    }
}