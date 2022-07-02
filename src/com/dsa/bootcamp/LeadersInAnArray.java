package com.dsa.bootcamp;

import java.util.ArrayList;

/*
 * Given an integer array A containing N distinct integers, you have to find all
 * the leaders in array A.
 * 
 * An element is a leader if it is strictly greater than all the elements to its
 * right side.
 * 
 * NOTE:The rightmost element is always a leader.
 * 
 * 
 * Input Format
 * 
 * First and only argument is an integer array A.
 * 
 * 
 * 
 * Output Format
 * 
 * Return an integer array denoting all the leader elements of the array.
 * 
 * NOTE: Ordering in the output doesn't matter.
 * 
 * 
 * Input 1:
 * 
 * A = [16, 17, 4, 3, 5, 2] Input 2:
 * 
 * A = [1, 2]
 * 
 * 
 * Example Output
 * 
 * Output 1:
 * 
 * [17, 2, 5] Output 2:
 * 
 * [2]
 * 
 * 
 * Explanation 1:
 * 
 * Element 17 is strictly greater than all the elements on the right side to it.
 * Element 2 is strictly greater than all the elements on the right side to it.
 * Element 5 is strictly greater than all the elements on the right side to it.
 * So we will return this three elements i.e [17, 2, 5], we can also return [2,
 * 5, 17] or [5, 2, 17] or any other ordering. Explanation 2:
 * 
 * Only 2 the rightmost element is the leader in the array.
 */

public class LeadersInAnArray {
	// function for finding leaders
	public static void leaderprint(int arr[], int n) {

		// last element of an array is leader by default
		int L = arr[n - 1];

		System.out.println(L + " is a leader one");

		// for finding leaders in other elements of the array
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > L) {
				L = arr[i];
				System.out.println(L + " is a leader");

			}
		}

	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		int n = A.size();
		int L = A.get(n - 1);
		System.err.println("L : " + L);
		num.add(L);
		for (int i = n - 2; i >= 0; i--) {
			if (A.get(i) > L) {
				L = A.get(i);
				num.add(L);
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] arr = { 18, 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(16);
		num.add(17);
		num.add(4);
		num.add(3);
		num.add(5);
		num.add(2);
		solve(num);
		System.out.println(solve(num));
		leaderprint(arr, n);
//       for(int i :a) {
//    	   System.out.println("L : "+i);
//       }
	}
}
