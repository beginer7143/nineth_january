/*
Easy 4: Password Length Check
Problem Statement
A login system checks whether a password is valid based on length.
Input Format
●	Integer representing password length
Expected Output
●	"STRONG PASSWORD" if length ≥ 8
●	"WEAK PASSWORD" otherwise
Sample Input
6
Sample Output
WEAK PASSWORD

*/
package nine_jan;

import java.util.Scanner;

public class PasswordLengthCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Login ID: ");
		sc.next();
		
		System.out.print("Enter Login Password: ");
		int pswd =sc.nextInt();
		
		if(pswd>=8) {
			System.out.println("STRONG PASSWORD");
		} else {
			System.out.println("WEAK PASSWORD");
		}
		sc.close();
	 }
}
