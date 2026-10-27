package com.solution.string_array;

import java.util.Scanner;

public class Reverse {

	public String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the word: ");
		try (Scanner sc = new Scanner(System.in)) {
			Reverse reverse = new Reverse();
			String input = sc.nextLine();
			String reverseString = reverse.reverseString(input);
//			System.out.println(reverseString);
			
			System.out.println(reverse.isPalindrome(input) ? "this is a palindrome string." : "the string is not palindrome.");
		}
	}
}
