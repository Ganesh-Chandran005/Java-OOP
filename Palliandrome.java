import java.util.Scanner;

public class Palliandrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int copy= num;
		int rev=0,rem;
		while(num>0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == copy) {
			System.out.println("Palliandrome");
		}else {
			System.out.println("Not Paliiandrome");
		}
		sc.close();
	}

}
