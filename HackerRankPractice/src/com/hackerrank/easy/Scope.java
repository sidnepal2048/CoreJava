package com.hackerrank.easy;
import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	// Add your code here
	Difference(int[] elements) {
		this.elements = elements;
	}

	public int computeDifference() {
		//bubble sort algorithm
		for (int i = (elements.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (elements[j - 1] > elements[j]) {
					int temp = elements[j - 1];
					elements[j - 1] = elements[j];
					elements[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		for(int i=0;i<elements.length;i++){
			System.out.print(elements[i]+ " ");
		}
		int max = elements[0];
		int min = elements[0];
		for(int i=0;i<elements.length;i++){
			
			if(max<elements[i]){
				max = elements[i];
			}
			if(min>elements[i]){
				min = elements[i];
			}
		}
		System.out.println("Min is: "+min);
		System.out.println("Max is: "+max);
		maximumDifference = max-min;
		//System.out.println("Maximum difference = "+maximumDifference);
		return maximumDifference;
	}
} // End of Difference class

public class Scope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Difference difference = new Difference(a);
		difference.computeDifference();
		System.out.print(difference.maximumDifference);
	}
}

/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {
        if (arr != null && !arr.isEmpty()){
            for(int i=0; i<arr.size();i++){
                if(k==arr.get(i)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        } 

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String res = findNumber(arr, k);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/