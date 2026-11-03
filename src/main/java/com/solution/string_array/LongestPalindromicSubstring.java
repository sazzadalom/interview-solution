package com.solution.string_array;


public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		 String str = longestPalindrome("abababad");
		System.out.println(str);
	}

    public static String longestPalindrome(String string){
        int start=0;
        int  end=0;
        for(int i=0;i<string.length();i++){
            int len1 = expandAroundCenter(string,i,i);
            int len2 = expandAroundCenter(string,i,i+1);
            int len = Math.max(len1,len2);
            if(len>(end-start)){
                start = i-(len-1)/2; // odd element handle here 
                end = i+len/2;  // even element handle here
            }
        }
        return string.substring(start,end+1);
    }
	private static int substring(String string) {
		int maxx = 0;
		
		for(int i=0; i<string.length(); i++) {
			int left = expandAroundCenter(string, i, i);
			int right = expandAroundCenter(string, i, i+1);
			int currentMaxx = Math.max(left, right);
			maxx = Math.max(maxx, currentMaxx);
		}
		return maxx;
	}

	private static int expandAroundCenter(String string, int left, int right) {
		
		while(left>=0 && right<string.length() && string.charAt(left)==string.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}

}
