package com.solution.string_array;
import java.util.*;

public class LongestSubstring {

	
	public static int substringOpt(String str) {
		int maxx = 0;
		int left = 0;
		Map<Character,Integer> map = new HashMap<>();
		for(int right=0; right<str.length(); right++) {
			char ch = str.charAt(right);
			if(map.containsKey(ch)) {
				left = Math.max(left, left+1);
			}
			
			map.put(ch, right);
			maxx = Math.max(maxx, right-left+1);
		}
		return maxx;
	}
	
	public static int substring(String str) {
		int maxx = 0;
		int[] arr = new int[256];
		int left = 0;
		
		for(int right=0; right<str.length(); right++) {
			char ch = str.charAt(right);
			arr[ch]++;
			
			while(arr[ch]>1) {
				char leftChar = str.charAt(left);
				arr[leftChar]--;
				left++;
			}
			maxx = Math.max(maxx, right-left+1);
		}
		return maxx;
	}
	
	public static void main(String[] args) {
		System.out.println(substringOpt("eeeec"));
	}

}
