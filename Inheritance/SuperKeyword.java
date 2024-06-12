// Parent class
class Animal2 {
    String color = "White";

    void eat() {
        System.out.println("This animal eats food.");
    }

    Animal2() {
        System.out.println("Animal is created");
    }
}

// Child class
class Dog3 extends Animal2 {
    String color = "Black";

    Dog3() {
        super(); // Call the parent class constructor
        System.out.println("Dog is created");
    }

    void displayColor() {
        System.out.println("Dog color: " + color);      // refers to current class color
        System.out.println("Animal color: " + super.color); // refers to parent class color
    }

    void eat() {
        System.out.println("Dog eats food.");
    }

    void work() {
        super.eat(); // Call the parent class method
        eat();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.displayColor();
        d.work();
    }
}
