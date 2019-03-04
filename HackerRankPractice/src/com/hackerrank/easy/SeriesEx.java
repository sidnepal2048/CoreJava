/*We use the integers a, b, and n to create the following series:
	(a+2^0*b), (a+2^0*b + 2^1*b)......(a+2^0*b + 2^1*b + 2^n-1 *b)
You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n 
values as a single line of n space-separated integers.
*/
package com.hackerrank.easy;

import java.util.Scanner;
import java.math.*;

public class SeriesEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	        
        	System.out.print("Enter value for a: ");
            int a = in.nextInt();
            System.out.println("Enter value for b: ");
            int b = in.nextInt();
            System.out.println("Enter value for n: ");
            int n = in.nextInt();
            int[] arr = new int[n];
            arr[0] = a + (int)(Math.pow(2,0) * b);
            System.out.print(arr[0] + " ");
            for(int i=1; i<n;i++){
            	arr[i] = arr[i-1] + (int)(Math.pow(2,i) * b);
            	
            	System.out.print(arr[i] + " ");
            }
            

        in.close();
	}

}
