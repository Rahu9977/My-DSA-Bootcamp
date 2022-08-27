package com.dsa.bootcamp.myrecursive;

public class Palindrome {

	static boolean isPalindrome(String str, int start, int end) {

		if (start > end)
			return true;
		if (str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return isPalindrome(str, start + 1, end - 1);
	}

	public static void main(String args[]) {
		String str = "geeg";

		if (isPalindrome(str, 0, str.length() - 1))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
