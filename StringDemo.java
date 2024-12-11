package com.fusion;

public class StringDemo {

    public static void main(String[] args) {

        // 1. Write a Java program to concatenate Two strings
        String str1 = "Jeevan";
        String str2 = "Mrityu";
        System.out.println("String concatenation: " + str1.concat(" ").concat(str2));

        // 2. Write a Java program to get the character at the given index within the String
        System.out.println("Character at given index (5): " + str1.charAt(5));

        // 3. Write a Java program to test if a given string contains the specified sequence of char values
        System.out.println("Contains 'van'? : " + str1.contains("van"));

        // 4. Write a Java program to convert all the characters in a string to Lowercase
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 5. Write a Java program to convert all the characters in a string to Uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // 6. Write a Java program to get the length of a given string
        System.out.println("Length of the string: " + str1.length());

        // 7. Write a Java program to check whether a given string starts with the contents of another string
        System.out.println("String stars's with: " + str1.startsWith("jee"));

        // 8. Write a Java program to get a substring of a given string between two specified positions
        System.out.println("Substring from index 1 to 4: " + str1.substring(1, 4));

        // 9. Write a Java program to trim any leading or trailing whitespace from a given string
        String str3 = "   Pune to Nashik   ";
        System.out.println("String after trimming: " +str3.trim());

        // 10. Write a Java program to search a word inside a string
        String stringLine = "Once upon a time in Pune!";
        String word = "upon";
        System.out.println("'"+stringLine+"' string contain 'in' word? " + stringLine.contains(word));
    }
}
