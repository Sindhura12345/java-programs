public class wordCount {
    public static void main(String[] args) {
        // Example string
        String input = "This is an example string to count the number of words.";

        // Count the words in the string
        int wordCount = countWords(input);

        // Print the word count
        System.out.println("The number of words in the string is: " + wordCount);
        System.out.println(input.length());
        System.out.println(input.trim());
        System.out.println(input.replaceAll("\\s+", ""));
    }
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        
        String[] words = str.split("\\s+");

        // Return the number of words
        return words.length;
    }
}

    

    

