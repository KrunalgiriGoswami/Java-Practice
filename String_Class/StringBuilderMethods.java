public class StringBuilderMethods {
    public static void main(String[] args) {

        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending to the StringBuilder
        sb.append(", World!");
        System.out.println("After append: " + sb);

        // Inserting into the StringBuilder
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);

        // Reversing the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Reversing it back to original order
        sb.reverse();
        System.out.println("Reversed back: " + sb);

        // Replacing part of the StringBuilder
        sb.replace(5, 15, " Wonderful");
        System.out.println("After replace: " + sb);

        // Deleting part of the StringBuilder
        sb.delete(5, 15);
        System.out.println("After delete: " + sb);

        // Deleting a single character
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // Converting StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final string: " + finalString);
    }
}
