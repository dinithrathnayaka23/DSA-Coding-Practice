/*
Write a recursive function to check whether a given word is a palindrome.
*/

public class Recursion06 {
    public static boolean isPalindrome(String word) {
        return isPalindromeHelper(word, 0, word.length() - 1);
    }

    private static boolean isPalindromeHelper(String word, int start, int end) {
        // Base case: pointers have met or crossed
        if (start >= end) {
            return true;
        }
        // If characters don't match, it's not a palindrome
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        // Recurse inward
        return isPalindromeHelper(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String[] testWords = {"racecar", "level", "hello", "madam", "java"};
        for (String w : testWords) {
            System.out.println(w + " -> " + isPalindrome(w));
        }
    }
}
