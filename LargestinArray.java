package Ganesh;

import java.util.Scanner;

public class LargestinArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a limit: ");
		int limit = sc.nextInt();
		int [] array = new int[limit];
		System.out.print("Enter array elements: ");
		for(int i=0;i<limit;i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0;i<limit;i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n");
		int largest = array[0]; 
		for(int i=0;i<limit;i++){
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		System.out.println("Largest element: " + largest);
	}
}

