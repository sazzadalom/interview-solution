package com.solution.string_array;


public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		int max = substring("abba");
		System.out.println(max);
	}

	private static int substring(String string) {
		int maxx = 0;
		
		for(int i=0; i<string.length(); i++) {
			int left = getPalindrom(string, i, i);
			int right = getPalindrom(string, i, i+1);
			int currentMaxx = Math.max(left, right);
			maxx = Math.max(maxx, currentMaxx);
		}
		return maxx;
	}

	private static int getPalindrom(String string, int left, int right) {
		
		while(left>=0 && right<string.length() && string.charAt(left)==string.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}

}
