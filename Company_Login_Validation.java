/*
Difficult 2: Company Login Validation (Limited Attempts)
Problem Statement
A company login system allows maximum 3 attempts.
 Correct password = 1234.
Input Format
●	Password entered 3 times (loop)
Expected Output
●	"LOGIN SUCCESSFUL" (if correct)
●	"ACCOUNT LOCKED" (after 3 failures)
Sample Input
1111
2222
1234
Sample Output
LOGIN SUCCESSFUL

*/

package nine_jan;



import java.util.Scanner;

public class Company_Login_Validation {
	public static void main(String arges[]) {
		Scanner sc = new Scanner(System.in);
	     
		int correctPassword = 1234;
		boolean isLoggedIn = false;
		
		for (int i  = 1; i<=3; i++) {
			int password = sc.nextInt();
			
			if (password == correctPassword) {
				
				System.out.println("LOGIN SUCCESSFUL");
				isLoggedIn = true;
				break;
			}
					
			}
			
			if (!isLoggedIn) {
				System.out.println("ACCOUNT LOCKED");
				
			}
			sc.close();
			
		}
		
	}


