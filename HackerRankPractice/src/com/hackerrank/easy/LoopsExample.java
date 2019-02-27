package com.hackerrank.easy;

import java.util.Scanner;

public class LoopsExample {
	public static void main(String[] args) {
		 Scanner scan1 = new Scanner(System.in);
	        int time =scan1.nextInt();
	        scan1.nextLine();
	        
	        while(time>0)
	            {
	            
	   
	        String str= scan1.nextLine();
	     
	        
	        char arr[] = str.toCharArray();
	        int len= str.length();
	        
	        for(int x=0;x<len;x=x+2)
	            {
	            
	            System.out.print(arr[x]);
	            
	            }
	        
	        System.out.print(" ");
	        
	         for(int x=1;x<len;x=x+2)
	            {
	            
	            System.out.print(arr[x]);
	         }
	        
	        System.out.println();
	        
	        time--;
	        }  
	        scan1.close();
	}
}
