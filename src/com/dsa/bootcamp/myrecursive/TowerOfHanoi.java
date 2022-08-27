package com.dsa.bootcamp.myrecursive;


//https://leetcode.com/discuss/general-discussion/470927/tower-of-hanoi-algorithm#:~:text=Question%3A,of%20an%20even%20larger%20one).
public class TowerOfHanoi {

	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		if (n == 1) {
			System.out.println("transfer disk " + n + " from " + src + " to " + dest);
			return;
		}
		towerOfHanoi(n - 1, src, dest, helper);
		System.out.println("transfer disk " + n + " from " + src + " to " + dest);
		towerOfHanoi(n - 1, helper, src, dest);
	}

	public static void main(String[] args) {
		int n = 2;
		towerOfHanoi(n, "S", "H", "D");
	}
}
