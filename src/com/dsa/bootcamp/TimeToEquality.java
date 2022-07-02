package com.dsa.bootcamp;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.

Input Format
First argument is an integer array A.


Output Format
Return an integer denoting the minimum time to make all elements equal.

Example Input
A = [2, 4, 1, 3, 2]


Example Output
8


Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class TimeToEquality {
	public static void main(String[] args) {
		List<Integer> B = new ArrayList();
		// A = [2, 4, 1, 3, 2]
		B.add(2);
		B.add(4);
		B.add(1);
		B.add(3);
		B.add(2);

		int max = B.get(0);
		for (int i = 1; i < B.size(); i++) {

			max = Math.max(B.get(i), max);

		}
		int time = 0;
		for (int i = 0; i < B.size(); i++) {
			time += max - B.get(i);
		}
		System.out.println(time);
		
		
		
		
	}
}
