package com.dsa.bootcamp;

//Write a function that takes an integer and returns the number of 1 bits it has.

/**
 * 
 Input Format

First and only argument contains integer A


Output Format

Return an integer as the answer


Example Input

Input1:
11


Explaination1:
11 is represented as 1011 in binary.
 *
 */
public class Number_of_Set_Bits {

	public static void main(String[] args) {
		System.out.println(numSetBits(11));
	}
	public static int numSetBits(int A) {
        if(A==0){
            return 0;
        }
            return (A & 1) + (numSetBits(A >> 1));
       
    }
}
