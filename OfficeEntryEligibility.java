/*
EASY LEVEL (5 Questions)
Easy 1: Office Entry Eligibility
Problem Statement
A company allows office entry only if an employee arrives before or at 9 AM.
Input Format
●	An integer representing arrival time (24-hour format, hour only)
Expected Output
●	"ALLOWED" if time ≤ 9
●	"LATE ENTRY" otherwise
Sample Input
9
Sample Output
ALLOWED

 
*/
package nine_jan;

import java.util.Scanner;

public class OfficeEntryEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter arrival time (hourly only): ");
		int arrivalTime = sc.nextInt();
		
		if(arrivalTime != 0 && arrivalTime <= 9) {
			System.out.println("ALLOWED");
		} else {
			System.out.println("LATE ENTRY");
		}
		sc.close();
	}

}
