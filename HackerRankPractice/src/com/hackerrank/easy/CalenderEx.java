/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time 
and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, 
such as getting the date of the next week.
You are given a date. You just need to write the method, getDay(), which returns the day on that date. To simplify your task, 
we have provided a portion of the code in the editor.
For example, if you are given the date August 14th 2017, the method should return  as the day on that date.
*/
package com.hackerrank.easy;

import java.io.IOException;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
		return null;

    }

}

public class CalenderEx {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String[] firstMultipleInput = sc.nextLine().replaceAll("\\s+$", "").split(" ");
    	//String[] firstMultipleInput = sc.next().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);
        
    }
}
