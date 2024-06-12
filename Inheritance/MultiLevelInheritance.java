// Grandparent class
class AnimalNew {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Parent class
class DogNew extends AnimalNew {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class
class Puppy extends DogNew {
    void play() {
        System.out.println("The puppy plays.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();  // Inherited from Animal
        p.bark(); // Inherited from Dog
        p.play(); // Own method
    }
}
