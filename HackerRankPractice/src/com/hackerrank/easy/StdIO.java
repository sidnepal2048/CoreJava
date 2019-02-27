package com.hackerrank.easy;

import java.util.Scanner;

public class StdIO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		scan.nextLine();
		while(t>0){
			String s = scan.nextLine();
			for(int i=0; i<s.length(); i+=2){
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
			for(int i=1; i<s.length(); i+=2){
				System.out.print(s.charAt(i));
			}
			System.out.println();
			t--;
		}
		scan.close();
	}

}
