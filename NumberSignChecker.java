/*
Easy 2: Number Sign Checker
Problem Statement
Determine whether a given number is Positive, Negative, or Zero.
Input Format
●	An integer number
Expected Output
●	"POSITIVE"
●	"NEGATIVE"
●	"ZERO"
Sample Input
-12
Sample Output
NEGATIVE

*/
package nine_jan;

import java.util.Scanner;

public class NumberSignChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		
		if(number >0) {
			System.out.println("Number is Positive.");
		} else {
			if(number <0) {
				System.out.println("Number is Negative.");
			} else {
				System.out.println("Number is Zero.");
			}
		}
		sc.close();
		
	}
}
