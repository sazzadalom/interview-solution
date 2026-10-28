package com.solution.string_array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AnagramsString {

	public static boolean isAnagram(String a,String b) {
		if(a.length()!=b.length()) return false;
		
		Map<Character,Integer> map = new HashMap<>();

		for(int i=0;i<a.length(); i++) {
			char ac = a.charAt(i);
			char bc = b.charAt(i);
			
			//add here
			map.put(ac, map.getOrDefault(ac,0)+1);
			
			//subtract here
			map.put(bc, map.getOrDefault(bc,0)-1);
		}
		
		for(int count :map.values()) {
			if(count!=0) return false;
		}
		
		return true;
	}
	
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
		boolean anagrams = isAnagram("nilw","link");
		System.out.println(anagrams);
	}

}
