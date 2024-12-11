package com.fusion;

public class StringExercise {

	// find the index of the last occurrence of a character
	static int getLastIndexOfCharacter(String str, char ch) {
		return str.lastIndexOf(ch);
	}
	
	// count words in the string using String
	static int countWordsWithoutSpaces(String str) {  
		System.out.println("String is: "+str);
		String[] strArr =  str.trim().split("\s+");
		return strArr.length;
	}
	
	// remove vowels from string
	static String removeVowels(String str) {
		System.out.println("String is: "+str);
		return str.replaceAll("[aeiouAEIOU]", "");
	}
	
	static void swapStringWithoutThirdVariable(String first, String second) {
	    System.out.println("Before Swap:");
	    System.out.println("First: " + first);
	    System.out.println("Second: " + second);

	    // Concatenate the strings
	    first = first + second;

	    // Update second string to the first part of concatenated string
	    second = first.substring(0, first.length() - second.length());

	    // Update first string to the second part of concatenated string
	    first = first.substring(second.length());

	    System.out.println("After Swap:");
	    System.out.println("First: " + first);
	    System.out.println("Second: " + second);
	}

	
	public static void main(String[] args) {

		System.out.println("Last index of 't' in \"Institute\" is: "+getLastIndexOfCharacter("Institute", 't'));

		// remove vowels
//		StringBuilder sb = new StringBuilder("Java language");
//		for (int i = 0; i < sb.length(); i++) {
//			if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o'
//					|| sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I'
//					|| sb.charAt(i) == 'O' || sb.charAt(i) == 'U') {
//				sb.deleteCharAt(i);
//				i--;
//			}
//		}
		
		String str = "Hello";
		System.out.println(str.replaceAll("[a,e,i,o,u]", ""));
		
		int count = countWordsWithoutSpaces("Hey, Good     morning! I am John.");
		System.out.println("Word count is: "+count);
		
		String resultedString = removeVowels("Anonymous persons are very strange.");
		System.out.println(resultedString);
		
		swapStringWithoutThirdVariable("ram", "sita");
	}

}
