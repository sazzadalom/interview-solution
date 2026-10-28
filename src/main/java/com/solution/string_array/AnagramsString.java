package com.solution.string_array;

import java.util.Map;
import java.util.TreeMap;

public class AnagramsString {

	public static boolean isAnagrams(String str, String str1) {
	    // If lengths are different, they cannot be anagrams
	    if (str.length() != str1.length()) {
	        return false;
	    }

	    Map<Character, Integer> map = new TreeMap<>();
	    Map<Character, Integer> map1 = new TreeMap<>();
	    
	    // Populate the first map with str characters
	    for (char ch : str.toCharArray()) {
	        map.put(ch, map.getOrDefault(ch, 0) + 1);
	    }
	    
	    // Populate the second map with str1 characters (fixed typo here)
	    for (char ch : str1.toCharArray()) {
	        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
	    }
	    
	    // Compare the two maps directly
	    return map.equals(map1);
	}
	
	public static void main(String[] args) {
		boolean anagrams = isAnagrams("listen","silent");
		System.out.println("are these strings anagram : " + (anagrams ? "YES":"NO"));
	}

}
