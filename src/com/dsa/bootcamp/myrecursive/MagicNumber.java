package com.dsa.bootcamp.myrecursive;

import java.util.Scanner;

public class MagicNumber {

	public static long CalculateSumOfDigits(long n) {

		if (n == 0) {
			return 0;
		} else {
			return n % 10 + CalculateSumOfDigits(n / 10);
		}
	}

	public static void main(String[] args) {
		long num = 0, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");

		num = sc.nextLong();

		temp = num;
		while (temp > 9) {
			temp = CalculateSumOfDigits(temp);
		}
		if (temp == 1) {
			System.out.println(num + " IS A MAGIC NUMBER");
		} else {
			System.out.println(num + " IS NOT A MAGIC NUMBER");
		}

	}

}
