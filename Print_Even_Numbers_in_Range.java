/*
Medium 3: Print Even Numbers in Range
Problem Statement
Print all even numbers between 1 and N.
Input Format
●	Integer N
Expected Output
●	All even numbers up to N
Sample Input
10
Sample Output
2 4 6 8 10

 

*/
package nine_jan;

import java.util.Scanner;

public class Print_Even_Numbers_in_Range {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
