package com.hackerrank.easy;

import java.util.HashMap;
import java.util.Scanner;

class HashMapEx {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		String name ;
		int phone;
		for (int i = 0; i < n; i++) {
			name = in.next();
			phone = in.nextInt();
			map.put(name, phone);
			System.out.println();
		}
		 while(in.hasNext()){
	            String s = in.next();
	            if(map.containsKey(s)){
	                 System.out.println(s + "=" + map.get(s));
	                 
	            }
	            else
	                {
	                System.out.println("Not found");
	            }
	        }
	        in.close();
	    }
	}

