package Classes_and_Objects;

class Hello {
    String name;

    // setter method
    void setName( String name ) {
        this.name = name;
    }

    // getter method
    String getName(){
        return this.name;
    }
}
public class ThisKeyword {
    public static void main( String[] args ) {
        Hello obj = new Hello();

        // calling the setter and the getter method
        obj.setName("Krunal");
        System.out.println("obj.name: "+obj.getName());
    }
}