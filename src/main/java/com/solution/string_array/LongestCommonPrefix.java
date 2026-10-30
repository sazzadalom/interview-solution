package com.solution.string_array;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = {"flower","flow","flight"}; 
		System.out.println(longestCommonPrefix(arr));
	}

	private static String longestCommonPrefix(String[] arr) {
		StringBuffer sb = new StringBuffer();
		
		Arrays.sort(arr);
		String first = arr[0];
		String last = arr[arr.length-1];
		String smallOne = first.length()>last.length()?last:first;
		for(int i=0;i<smallOne.length();i++) {
			if(first.charAt(i)==last.charAt(i)) {
				sb.append(last.charAt(i));
			}
		}
		return sb.toString();
	}

}
