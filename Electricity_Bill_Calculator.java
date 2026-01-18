/*
DIFFICULT LEVEL (2 Questions)
Difficult 1: Electricity Bill Calculator
Problem Statement
Calculate electricity bill based on units:
Units	Rate
First 100	₹5/unit
Next 100	₹7/unit
Above 200	₹10/unit
Input Format
●	Integer units consumed
Expected Output
●	Total bill amount
Sample Input
250
Sample Output
1850

*/

package nine_jan;

import java.util.Scanner;

public class Electricity_Bill_Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Units : ");
		int units = sc.nextInt();
		double bill =0;
		
		if(units <=100) {
			bill = units*5;
		} else if(units <=200) {
			bill = (100*5)+((units-100)*7);
		} else {
			bill = (100*5)+(100*7)+((units-200)*10);
		}
		System.out.println(bill);
		sc.close();
	}
}
