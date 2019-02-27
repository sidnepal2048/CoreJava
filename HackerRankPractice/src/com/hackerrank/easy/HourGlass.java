package com.hackerrank.easy;

import java.util.Scanner;

class HourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
        int sum=0;
        int max = 0;
        for (int i = 0; i < 6; i++) {
           // String[] arrRowItems = sc.nextLine().split(" ");
            //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                //int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<6;i++){
        	for(int j=0; j<6;j++){
        		System.out.print(arr[i][j]+"\t");
        	}
        	System.out.println();
        }
        
        for(int i=0;i<4;i++){
        	for(int j=0; j<4;j++){
        		sum = (arr[i][j]+arr[i][j+1]+arr[i][j+2])+(arr[i+1][j+1])+(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
        			
        			if(max<sum){
        				max=sum;
        			} 		
             	}
        	//System.out.println("Sum: "+sum);
        	//System.out.println("max: "+max);
        }
        System.out.println("SUM: "+sum);
        System.out.println(max);
        sc.close();
	}

}
