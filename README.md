# My-DSA-Bootcamp


<details>
<summary>Types of Bitwise Operator.</summary>
<code style="white-space:nowrap;">

There are six types of the bitwise operator in Java:
   o	Bitwise AND
   o	Bitwise exclusive OR
   o	Bitwise inclusive OR
   o	Bitwise Compliment
   o	Bit Shift Operators
 
  ![image](https://user-images.githubusercontent.com/29138925/161416450-8463c3d3-441e-4186-b925-a757c2e40237.png)


 
 
Let's explain the bitwise operator in detail.
**Bitwise AND (&)**
It is a binary operator denoted by the symbol &. It returns 1 if and only if both bits are 1, else returns 0.
![image](https://user-images.githubusercontent.com/29138925/161416321-cce79c1c-be1c-40e1-9e98-78d45e12d2c2.png)
 

**Bitwise exclusive XOR (^)**
It is a binary operator denoted by the symbol ^ (pronounced as caret). It returns 0 if both bits are the same, else returns 1.
 ![image](https://user-images.githubusercontent.com/29138925/161416333-736151df-7bea-4358-af8d-7857c8038c93.png)

 
**Bitwise inclusive OR (|)**
It is a binary operator denoted by the symbol | (pronounced as a pipe). It returns 1 if either of the bit is 1, else returns 0.
 ![image](https://user-images.githubusercontent.com/29138925/161416342-625ec748-89e3-4f92-8ebd-ea0f8152b1ed.png)

 
 
**Bitwise Complement (~)**
It is a unary operator denoted by the symbol ~ (pronounced as the tilde). It returns the inverse or complement of the bit. It makes every 0 a 1 and every 1 a 0.
![image](https://user-images.githubusercontent.com/29138925/161416350-e51cfac1-ee02-4686-a5fd-41d67afdaaa9.png)
 

**Left Shifts**
   
When shifting left, the most-significant bit is lost, and a 00 bit is inserted on the other end.
The left shift operator is usually written as "<<".
  0010 << 1  →  0100
0010 << 2  →  1000
A single left shift multiplies a binary number by 2:
  0010 << 1  →  0100

0010 is 2
0100 is 4

**Logical Right Shifts**
 
   When shifting right with a logical right shift, the least-significant bit is lost and a 00 is inserted on the other end.
     1011 >>> 1  →  0101
   1011 >>> 3  →  0001
   For positive numbers, a single logical right shift divides a number by 2, throwing out any remainders.
     0101 >>> 1  →  0010

   0101 is 5
   0010 is 2
 
 
**Arithmetic Right Shifts**
 
When shifting right with an arithmetic right shift, the least-significant bit is lost and the most-significant bit is copied.
Languages handle arithmetic and logical right shifting in different ways. Java provides two right shift operators: >> does an arithmetic right shift and >>> does a logical right shift.
  1011 >> 1  →  1101
1011 >> 3  →  1111

0011 >> 1  →  0001
0011 >> 2  →  0000
 
The first two numbers had a 11 as the most significant bit, so more 11's were inserted during the shift. The last two numbers had a 00 as the most significant bit, so the shift inserted more 00's.
If a number is encoded using two's complement, then an arithmetic right shift preserves the number's sign, while a logical right shift makes the number positive.
  // Arithmetic shift
1011 >> 1  →  1101
    1011 is -5
    1101 is -3

// Logical shift
1111 >>> 1  →  0111
    1111 is -1
    0111 is  7


  </code>
</details>
 
<details>
<summary>Introduction to Number System and Bit Manipulation - ! 1. Single Number.</summary>
<code style="white-space:nowrap;">
 
Introduction to Number System and Bit Manipulation**

Problem Description
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?



Problem Constraints
2 <= |A| <= 2000000

0 <= A[i] <= INTMAX



Input Format
The first and only argument of input contains an integer array A.



Output Format
Return a single integer denoting the single element.



Example Input
Input 1:

 A = [1, 2, 2, 3, 1]
Input 2:

 A = [1, 2, 2]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

3 occurs once.
Explanation 2:

1 occurs once.

 </code>
</details>




<details>
<summary>Introduction to Number System and Bit Manipulation - ! Q2. Number of 1 Bits.</summary>
<code style="white-space:nowrap;">
 
Introduction to Number System and Bit Manipulation**

Problem Description

Write a function that takes an integer and returns the number of 1 bits it has.


Problem Constraints

1 <= A <= 109


Input Format

First and only argument contains integer A


Output Format

Return an integer as the answer


Example Input

Input1:
11


Example Output

Output1:
3


Example Explanation

Explaination1:
11 is represented as 1011 in binary.
 </code>
</details>
<details>
<summary>Introduction to Number System and Bit Manipulation - ! Q1. Single Number III.</summary>
<code style="white-space:nowrap;">
 
Introduction to Number System and Bit Manipulation**

Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.


Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109


Input Format
The first argument is an array of integers of size N.


Output Format
Return an array of two integers that appear only once.


Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:
A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:
[1, 2]


Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:
1 and 2 appear only once.
 </code>
</details>

<details>
<summary> Arrays & Dynamic Arrays - ! Reverse the Array.</summary>
<code style="white-space:nowrap;">
 
** Arrays & Dynamic Arrays**

Problem Description
You are given a constant array A.
You are required to return another array which is the reversed form of the input array.


Problem Constraints
1 <= A.size() <= 10000
1 <= A[i] <= 10000


Input Format
First argument is a constant array A.


Output Format
Return an integer array.


Example Input
Input 1:
A = [1,2,3,2,1]
Input 2:
A = [1,1,10]


Example Output
Output 1:
 [1,2,3,2,1] 
Output 2:
 [10,1,1] 


Example Explanation
Explanation 1:
Reversed form of input array is same as original array
Explanation 2:
Clearly, Reverse of [1,1,10] is [10,1,1]
 </code>
</details>

<details>
<summary> Arrays & Dynamic Arrays - ! Noble Integer.</summary>
<code style="white-space:nowrap;">
 
** Arrays & Dynamic Arrays**
Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.


Problem Constraints
1 <= |A| <= 2*105
1 <= A[i] <= 107


Input Format
First and only argument is an integer array A.


Output Format
Return 1 if any such integer p is present else, return -1.


Example Input
Input 1:
 A = [3, 2, 1, 3]
Input 2:
 A = [1, 1, 3, 3]


Example Output
Output 1:
 1
Output 2:
 -1


Example Explanation
Explanation 1:
 For integer 2, there are 2 greater elements in the array..
Explanation 2:
 There exist no integer satisfying the required conditions.
 </code>
</details>


