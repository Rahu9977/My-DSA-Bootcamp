package com.dsa.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Problem Description
//Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

/**
Example Input Input 1:

A=[1,2,2,3,1]Input 2:

A=[1,2,2]

Example Output Output 1:

3 Output 2:

1

Example Explanation Explanation 1:

3 occurs once.Explanation 2:

1 occurs once.
*/
public class SingleNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,3,1);
		System.err.println(singleNumber(list));
	}
	
	public static int singleNumber(final List<Integer> A) {
        
        int res = A.get(0);
       for (int i = 1; i < A.size(); i++)
           res = res ^ A.get(i);
    
       return res;
   }
}
