class Person {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }
}

public class ToStringMethod {
    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("Krunal", 20, "123 Main St");
        Person person2 = new Person("Gaurav", 21, "456 East St");

        // Using the toString method
        System.out.println(person1.toString());
        System.out.println(person2.toString());


        System.out.println(person1);
        System.out.println(person2);
    }
}
