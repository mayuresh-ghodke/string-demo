package com.fusion;

public class StringOperations {

    // 1. Replace a specified character with another character
    static void replaceCharWithNewChar(String str, char oldChar, char newChar) {
        String replacedString = str.replace(oldChar, newChar);
        System.out.printf("String after replacing %c with %c in %s: %s\n", oldChar, newChar, str, replacedString);
    }

    // 2. Create a new string repeating every character twice
    static void repeatCharacters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + "" + str.charAt(i);
        }
        System.out.printf("String after repeating every character in \"%s\": %s\n", str, result);
    }

    // 3. Count words in a given string
    static void countWords(String str) {
        String[] words = str.trim().split("\\s+");
        System.out.printf("The string \"%s\" has %d words.\n", str, words.length);
    }

    // 4. Swap two strings using a third variable
    static void swapStrings(String str1, String str2) {
    	System.out.println("----------------------------------------");
        System.out.printf("Before Swap: str1 = \"%s\", str2 = \"%s\"\n", str1, str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.printf("After Swap: str1 = \"%s\", str2 = \"%s\"\n", str1, str2);
        System.out.println("----------------------------------------");
    }

    // 6. Reverse a word
    static void reverseWord(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed+str.charAt(i);
        }
        System.out.printf("Reverse of '%s' is: '%s' \n", str, reversed);
    }

    // 7. Check if a word is a palindrome or not
    static void isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        boolean isPalindrome = str.equalsIgnoreCase(reversed);
        System.out.printf("Is %s a palindrome? %b\n", str, isPalindrome);
    }

    // 8. Count total characters in a string excluding spaces
    static void countCharactersExcludingSpaces(String str) {
        String removeSpaces = str.replace(" ", "");
        System.out.printf("Total number of characters in '%s' without spaces is: %d.\n", str, removeSpaces.length());
    }

    // 9. Count vowels and consonants in a string
    static void countVowelsAndConsonants(String str) {
    	int vowelsCount = 0, consonentsCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
            else if (ch >= 'a' && ch <= 'z') {
            	consonentsCount++;
            }
        }
        System.out.println("String is: "+str);
        System.out.println("Vowels count     : " + vowelsCount);
        System.out.println("Consonants count : " + consonentsCount);
    }

    public static void main(String[] args) {
        replaceCharWithNewChar("Institute", 'e', 't');
        repeatCharacters("Hello");
        countWords("Ohh, that is great!");
        swapStrings("First", "Second");
        reverseWord("opposite");
        isPalindrome("Radar");
        countCharactersExcludingSpaces("I don't know, what to do.");
        countVowelsAndConsonants("Anthony come here");
        
        String str = "string".replace('i', 'o');
        System.out.println(str.substring(2,5));
    }
}
