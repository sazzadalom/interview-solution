package com.solution.num;

public class ReverseNumber {
	static int reverseNum(int num) {
		int num1 = 0;
		while (num != 0) {
			int remainder = num % 10; // 3 2
			num1 = (num1 * 10) + remainder; // 32
			num = num / 10; // 1 2
		}

		return num1;
	}

	public static void main(String[] args) {

		System.out.println(reverseNum(-123));
	}
}
