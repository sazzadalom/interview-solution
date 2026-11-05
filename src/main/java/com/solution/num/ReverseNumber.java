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
	
	
	static long reverse(int num) throws NumberFormatException {
		boolean isNegative = Math.abs(num) < 0 ? true : false;
		String numx = String.valueOf(Math.abs(num));
		StringBuffer sb = new StringBuffer(numx);
		long int1 = Long.parseLong(sb.reverse().toString());
		return isNegative ? Math.negateExact(int1) : int1;
	}

	public static void main(String[] args) throws NumberFormatException{

		System.out.println(reverse(1056389759));
	}
}
