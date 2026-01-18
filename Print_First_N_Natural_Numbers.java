/*
Easy 5: Print First N Natural Numbers
Problem Statement
Print the first N natural numbers starting from 1.
Input Format
●	Integer N
Expected Output
●	Numbers from 1 to N (space separated)
Sample Input
5
Sample Output
1 2 3 4 5


*/
package nine_jan;

import java.util.Scanner;

public class Print_First_N_Natural_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		
		for(int i=0; i<=number;i++) {
			if(i>0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
