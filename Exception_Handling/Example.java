package Exception_Handling;

public class Example {
    public static void main(String[] args) {
        // try block
        try  {
            // try block statements
            System.out.println("I am in Try Block");
            int data=50/0;
        }
        // catch block
        catch(ArithmeticException e)
        {
            // catch block exceptions
            System.out.println(e);
            System.out.println("Catch Block Executed");
        }
    }
}
