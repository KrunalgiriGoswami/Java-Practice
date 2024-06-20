// StaticControlFlow class
class StaticControlFlow {
    // initializing static integer
    static int a = 100;

    // static main method
    public static void main(String[] args) {
        // calling static method print()
        print();
        System.out.println("Main Method");
    }

    // first static block
    static {
        // display value of a
        System.out.println(a);

        // calling static method print()
        print();
        System.out.println("Inside First Static Block");
    }

    public static void print(){
        // displaying value of b
        System.out.println(b);
    }

    // second static block
    static {
        System.out.println("Inside Second Static Block");
    }

    //initializing static integer b
    static int b = 200;

}
