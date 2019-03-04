package com.hackerrank.easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {
        String res=" ";
    	if (arr != null && !arr.isEmpty()){
            for(int i=0; i<arr.size();i++){
                if(arr.contains(k)){
                    res = "Yes";
                }else{
                    res = "No";
                }
            }
        } 
    	return res;
    }

    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
*/
    	int arrCount =6;
    	Scanner sc = new Scanner(System.in);
    	List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = sc.nextInt();
            arr.add(arrItem);
        }

        int k = sc.nextInt();
        sc.close();
        String res = findNumber(arr, k);
        System.out.println(res);
            }
}
