import java.util.Scanner;

public class EvenUptoN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n= sc.nextInt();
		System.out.println("Even numbers upto " + n);
		for(int i=0;i<=n;i+=2) {
				System.out.println(i);
				}
		sc.close();
		}
}
