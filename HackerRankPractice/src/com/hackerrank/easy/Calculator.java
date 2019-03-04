package com.hackerrank.easy;

import java.util.Scanner;


//Write your code here
class Calculator1{
	public int power(int n, int p) throws Exception{
		int ans=0;
		if(n<0 || p<0){
			throw new Exception("n and p should be non-negative");
		}else{
			ans = (int) Math.pow(n, p);
		}
		
		return ans;
	}
}
class Calculator{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator1 myCalculator = new Calculator1();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
