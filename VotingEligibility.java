/*Author       : Ganesh Chandran
  Date         : 11-05-2025
  Description  : Chacking Voting Eligibility*/
import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Eligible to vote!");
		}else {
			System.out.println("Not Eligible");
		}
		sc.close();
	}
}
