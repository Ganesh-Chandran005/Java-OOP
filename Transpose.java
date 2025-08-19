package Ganesh;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter the no of columns: ");
		int col = sc.nextInt();
		int [][] matrix = new int [row][col];
		System.out.print("Enter matrix elements: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.print("Matrix: ");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j] + "\t");
				
			}
			System.out.println();
		}
		System.out.print("Transposed Matrix: ");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[j][i] + "\t");
				
			}
			System.out.println();
		}
		
	}

}
