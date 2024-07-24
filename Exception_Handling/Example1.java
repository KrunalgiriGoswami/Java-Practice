package Exception_Handling;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Started..."); //starting ...

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("We have got two numbers...");

            int result = n1/n2;

            System.out.println("Divition is: " + result);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("here is exception");
            System.out.println(e.getMessage());
        }

        System.out.println("Terminated..."); //ending point

    }
}
