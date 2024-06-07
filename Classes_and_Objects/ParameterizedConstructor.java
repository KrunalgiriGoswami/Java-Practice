
class Main {

    String name;
    int id;
    Main(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Main obj = new Main("Krunal", 94);
        System.out.println("Name :" + obj.name + "\nId :" + obj.id);
    }
}