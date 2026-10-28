package com.solution.string_array;

import java.util.Map;
import java.util.TreeMap;

public class AnagramsString {

	public static boolean isAnagrams(String str,String str1) {
		boolean anagram = false;
		Map<Character,Integer> map = new TreeMap<>();
		Map<Character,Integer> map1 = new TreeMap<>();
		
		if(str.length()==str1.length()) {
			for(char ch : str.toCharArray()) {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
			for(char ch : str1.toCharArray()) {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
			
			for(Map.Entry<Character,Integer> entry : map.entrySet()) {
				if(entry.getValue()==map1.get(entry.getKey())) {
					anagram = true;
				}else {
					anagram = false;
				}
			}
		}
		return anagram;
	}
	
	public static void main(String[] args) {
		boolean anagrams = isAnagrams("listeen","silent");
		System.out.println("are these strings anagram : " + (anagrams ? "YES":"NO"));
	}

}
