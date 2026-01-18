/*
MEDIUM LEVEL (3 Questions)
Medium 1: Employee Performance Rating
Problem Statement
An employee’s rating depends on performance score.
Input Format
●	Integer score (0–100)
Expected Output
Score Range	Output
≥ 75	EXCELLENT
50–74	GOOD
< 50	NEED IMPROVEMENT
Sample Input
68
Sample Output
GOOD

*/
package nine_jan;

import java.util.Scanner;

public class Employee_Performance_Rating {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Score : ");
		int score = sc.nextInt();
		
		if(score >=75) {
			System.out.println("EXCELLENT");
		} else if(score >= 50 && score < 75) {
			System.out.println("GOOD");
		} else if(score < 50) {
			System.out.println("NEED IMPROVEMENT");
		} else {
			System.out.println("Invalid Input!");
		}
		sc.close();
	}
}
