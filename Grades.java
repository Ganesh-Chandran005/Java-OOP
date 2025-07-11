import java.util.Scanner;

public class Grades{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int mark=sc.nextInt();
		
		if(mark>=90) {
			System.out.println("Grade A");
		}else if(mark>=75 && mark<90) {
			System.out.println("Grade B");
		}else {
			System.out.println("Grade C");
		}
		sc.close();
		}

}
