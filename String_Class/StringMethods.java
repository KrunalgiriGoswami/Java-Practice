public class StringMethods {
    public static void main(String[] args) {

        // Creating strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Hello World!   ";
        String str4 = "hello";

        // Length of a string
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // Concatenation of strings
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenated);

        // Substring
        String substring = str1.substring(1, 4);
        System.out.println("Substring of str1 from index 1 to 3: " + substring);

        // Character at a specific index
        char charAt = str1.charAt(1);
        System.out.println("Character at index 1 in str1: " + charAt);

        // Comparison of strings (case-sensitive)
        boolean equals = str1.equals(str4);
        System.out.println("str1 equals str4: " + equals);

        // Comparison of strings (case-insensitive)
        boolean equalsIgnoreCase = str1.equalsIgnoreCase(str4);
        System.out.println("str1 equalsIgnoreCase str4: " + equalsIgnoreCase);

        // String starts with a prefix
        boolean startsWith = str1.startsWith("He");
        System.out.println("str1 starts with 'He': " + startsWith);

        // String ends with a suffix
        boolean endsWith = str1.endsWith("lo");
        System.out.println("str1 ends with 'lo': " + endsWith);

        // Index of a character or substring
        int indexOfChar = str1.indexOf('l');
        int indexOfSubstring = str1.indexOf("lo");
        System.out.println("Index of 'l' in str1: " + indexOfChar);
        System.out.println("Index of 'lo' in str1: " + indexOfSubstring);

        // Last index of a character or substring
        int lastIndexOfChar = str1.lastIndexOf('l');
        System.out.println("Last index of 'l' in str1: " + lastIndexOfChar);

        // Replace characters in a string
        String replacedString = str1.replace('l', 'p');
        System.out.println("str1 after replacing 'l' with 'p': " + replacedString);

        // Convert to upper case
        String upperCaseString = str1.toUpperCase();
        System.out.println("str1 in upper case: " + upperCaseString);

        // Convert to lower case
        String lowerCaseString = str1.toLowerCase();
        System.out.println("str1 in lower case: " + lowerCaseString);

        // Trim whitespace from the beginning and end
        String trimmedString = str3.trim();
        System.out.println("str3 after trimming: '" + trimmedString + "'");

        // Split a string into an array
        String[] splitString = concatenated.split(" ");
        System.out.println("Splitting concatenated string by space:");
        for (String part : splitString) {
            System.out.println(part);
        }

        // Checking if a string is empty
        boolean isEmpty = str1.isEmpty();
        System.out.println("str1 is empty: " + isEmpty);

        // Joining strings
        String joinedString = String.join("-", str1, str2);
        System.out.println("Joining str1 and str2 with '-': " + joinedString);
    }
}
