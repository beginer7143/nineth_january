/*
Easy 3: Day Type Identifier (Switch Case)
Problem Statement
A company system identifies whether a day is a Working Day or Weekend.
Input Format
●	Integer (1–7)

○	1 = Monday … 7 = Sunday
Expected Output
●	"WORKING DAY" (Mon–Fri)
●	"WEEKEND" (Sat–Sun)
Sample Input
6

Sample Output
WEEKEND

*/
package nine_jan;


import java.util.Scanner;
	

public class DayTypeIdentifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int day  = sc.nextInt();
		
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
	System.out.println("WORKING DAY");
	           break;
	           
		case 6:
		case 7:
   System.out.println("WEEKND");
              break;
            default:
   System.out.println("INVALID DAY");
		}
		
		sc.close();    	
		}
}