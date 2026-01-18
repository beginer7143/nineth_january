/*
Medium 2: ATM Withdrawal Simulation
Problem Statement
ATM allows withdrawal only if:
●	Amount is multiple of 100
●	Balance ≥ withdrawal amount
Input Format
1.	Account balance (int)
2.	Withdrawal amount (int)
Expected Output
●	"WITHDRAWAL SUCCESSFUL"
●	"INSUFFICIENT BALANCE"
●	"INVALID AMOUNT"
Sample Input
5000
1200
Sample Output
WITHDRAWAL SUCCESSFUL



*/
package nine_jan;

import java.util.Scanner;

public class ATM_Withdrawal_Simulation{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Account Balance : ");
		int accountBalance = sc.nextInt();
		
		System.out.print("Enter Withdraw Amunt : ");
		int withdrawAmount = sc.nextInt();
		
		if (withdrawAmount % 100!= 0)
		{
			System.out.println("INVALD AMOUNT");
		}
		
		else if (accountBalance >= withdrawAmount) {
			
			System.out.println("WITHDRAWAL SUCCESSFUL");
		}
		else {
			System.out.println("INSUFFICIENT BALANCE");
		}
		sc.close();
	}
}
		