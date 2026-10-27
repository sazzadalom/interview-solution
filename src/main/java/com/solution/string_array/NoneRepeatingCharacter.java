package com.solution.string_array;public class NoneRepeatingCharacter {

	public static Character firstNoneRepeate(String str) {
		int[] arr = new int[256];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			arr[ch] = arr[ch] + 1;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(arr[ch]==1) {
				return ch;
			}
		}
		return null;
	}
	
	public static Character secondNonRepeate(String str) {
		
		// almost all unique code ASCII values
		int[] arr = new int[256];
		
		// To collect into an array
		for(char ch : str.toCharArray()) {
			arr[ch] = arr[ch]+1;
		}
		
		char[] nonRepeate = new char[str.length()];
		int index = 0;
		
		// To find from the array
		for(char ch : str.toCharArray()) {
			if(arr[ch]==1) {
				nonRepeate[index++] = ch; 
			}
		}
		
		
		if(index > 0) {
			if(index>1) 
				return nonRepeate[1];
			else
				return nonRepeate[0];
		}
		return null;
	}
	
	public static void main(String[] args) {
//		Character ch = firstNoneRepeate("sazzad");
		Character ch = secondNonRepeate("aazzalmk");
		System.out.println(ch==null?"there is not any unique character":ch);
	}
}
