public class StringBufferMethods {
    public static void main(String[] args) {

        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Appending strings
        sb.append(", World!");
        System.out.println("After append: " + sb);

        // Inserting a string at a specified position
        sb.insert(7, "Beautiful ");
        System.out.println("After insert: " + sb);

        // Reversing the contents of the StringBuffer
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Reversing it back to original state
        sb.reverse();
        System.out.println("After reverse again: " + sb);

        // Deleting a part of the string
        sb.delete(7, 17);
        System.out.println("After delete: " + sb);

        // Replacing a part of the string
        sb.replace(7, 12, "Java");
        System.out.println("After replace: " + sb);

        // Getting the length of the StringBuffer
        int length = sb.length();
        System.out.println("Length of StringBuffer: " + length);

        // Getting the capacity of the StringBuffer
        int capacity = sb.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);

        // Ensuring a minimum capacity
        sb.ensureCapacity(50);
        System.out.println("New capacity after ensureCapacity(50): " + sb.capacity());

        // Getting the character at a specific index
        char charAt = sb.charAt(1);
        System.out.println("Character at index 1: " + charAt);

        // Setting the character at a specific index
        sb.setCharAt(1, 'a');
        System.out.println("After setCharAt: " + sb);

        // Getting a substring
        String substring = sb.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Getting a substring with a specified range
        String substringRange = sb.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substringRange);
    }
}
