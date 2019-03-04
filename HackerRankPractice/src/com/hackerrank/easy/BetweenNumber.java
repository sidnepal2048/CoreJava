package com.hackerrank.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BetweenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int l = sc.nextInt();
		System.out.println("Enter second number: ");
		int m = sc.nextInt();
		if(l>m){
			System.out.println("Enter number greater than "+ l);
			m = sc.nextInt();
		}
    	List<Integer> arr = new ArrayList<>();
    	int a= Math.abs(m-l);
    	for(int i=l; i<=m;i++){
    		if(l%2==0){
    			arr.add(i+2);
    			if(arr.contains(m)){
    				break;
    			}
    		}else{
    			arr.add(i+3);
    		}
    	}
    	Iterator<Integer> itr = arr.iterator();
    	while(itr.hasNext()){
    			System.out.println(itr.next()+ " ");	
    		
    		
    	}
	}

}
