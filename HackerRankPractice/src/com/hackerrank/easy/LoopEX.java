/*Given an integer, print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
Input Format
	A single integer, N.
Constraints
	2<=N<=20
Output Format
	Print  lines of output; each line  (where ) contains the  of  in the form: 
		N x i = result.
		*/
package com.hackerrank.easy;

import java.util.Scanner;

public class LoopEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive integer: ");
		int N = sc.nextInt();
        //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for(int i = 1;i<=10;i++){
			System.out.println(N +" x "+ i + " = " + N*i);
		}
        sc.close();

	}

}
