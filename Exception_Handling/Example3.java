package Exception_Handling;

public class Example3 {
    public static void main(String args[]){
        // try block
        try{
            System.out.println("I am in the try Block");
            int temp = 50/0;
            System.out.println(temp);
        }
        //Catch Block
        catch(ArithmeticException e){
            System.out.println(e);
        }
        //finally block
        finally {
            System.out.println("I am in finally block");
        }
    }
}
