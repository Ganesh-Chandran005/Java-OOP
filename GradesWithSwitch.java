/*Author       : Ganesh Chandran
  Date         : 11-05-2025
  Description  : Result according to grades using Switch.*/
import java.util.Scanner;

public class GradesWithSwitch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Grade:O/A/B/C/P/F ");
		String grade=sc.nextLine();
		switch (grade) {
			case "O" :
				System.out.println("Outstanding");
				break;
			case "A" :
				System.out.println("Excellent");
				break;
			case "B" :
				System.out.println("Good");
				break;
			case "C" :
				System.out.println("Average");
				break;
			case "P" :
				System.out.println("Pass");
				break;
			case "F" :
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid Grade");
		};
		sc.close();
		
		
		
	}

}
