package com.solution.string_array;

public class FindMissingNum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,8,10};
		findMisingNu(arr);
	}

	private static void findMisingNu(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j = arr[i]+1; j<arr[i+1]; j++) {
				System.out.print(j + " ");
			}
		}
		
	}

}
