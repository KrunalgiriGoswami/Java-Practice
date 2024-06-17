public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Find the longest word in this sentence";
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("The longest word is: " + longest);
    }
}
