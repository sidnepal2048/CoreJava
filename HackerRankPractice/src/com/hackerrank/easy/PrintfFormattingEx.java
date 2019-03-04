package com.hackerrank.easy;

import java.util.Scanner;

public class PrintfFormattingEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			int b = Integer.toString(x).length();
			if (b == 3) {
				System.out.printf("%-15s", s1);
				System.out.printf("%d%n", x);
			} else {
				if(b==2){
					System.out.printf("%-15s", s1);
					System.out.printf("0"+"%d%n", x);
				}else{
					System.out.printf("%-15s", s1);
			          System.out.printf("00"+"%d%n", x);
				}
			}
		}
		System.out.println("================================");
	}
}
