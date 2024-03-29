package com.dsa.bootcamp.myrecursive;

public class Factorial {

	public static void main(String[] args) {
		 // Calling method 1 to compute factorial and
        // storing the result into a variable
        int ans = factorial(5);
 
        // Print and display the factorial of number
        // customly passed as an argument
        System.out.println("Factorial of 5 is :" + ans);

	}
	static int factorial(int n)
    {
 
        // Handling base case
        // iIf value of n=1 or n=0, it returns 1
        if (n == 0 || n == 1)
            return 1;
 
        // Generic case
        // Otherwise we do n*(n-1)!
        return n * factorial(n - 1);
    }

}
