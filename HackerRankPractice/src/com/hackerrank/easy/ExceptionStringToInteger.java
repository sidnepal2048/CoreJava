package com.hackerrank.easy;

import java.util.Scanner;

public class ExceptionStringToInteger {
	public static void exceptionHandler(String s) {
		try {

			int c = Integer.parseInt(s);
			System.out.print(c);
		} catch (Exception e) {
			
			System.out.println("Bad String");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String s = sc.next();
		exceptionHandler(s);
		sc.close();
	}

}
