package Classes_and_Objects;

class Main {

    String name;
    int id;

    // Parameterized Constructor
    Main(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Main(Main obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
public class CopyConstructor {
    public static void main(String[] args)
    {
        System.out.println("First Object");
        Main obj1 = new Main("Krunal", 94);
        System.out.println("Name :" + obj1.name + "\nGeekId :" + obj1.id);

        System.out.println();

        // This would invoke the copy constructor.
        Main obj2 = new Main(obj1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("Name :" + obj2.name + "\nGeekId :" + obj2.id);
    }
}
