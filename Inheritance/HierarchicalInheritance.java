// Parent class
class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog2 extends Animal1 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal1 {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.eat();  // Inherited from Animal
        d.bark(); // Own method

        Cat c = new Cat();
        c.eat();  // Inherited from Animal
        c.meow(); // Own method
    }
}
