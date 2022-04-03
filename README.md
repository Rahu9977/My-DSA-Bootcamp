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

