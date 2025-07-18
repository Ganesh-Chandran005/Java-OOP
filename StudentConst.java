/*Author       : Ganesh Chandran
  Date         : [Date]
  Description  : [Question] */
package LAB;

import java.util.Scanner;

class Student{
	String name;
	int rollNumber;
	String dept;
	Student(String studentName,int roll,String department){
		name=studentName;
		rollNumber=roll;
		dept=department;
	}
	public void StudentInfo() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Department: " + dept);
	}
}

public class StudentConst {
	public static void main(String[] args) {
		String name;
		int roll;
		String dept;
		System.out.println("Enter student details...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter roll number: ");
		roll=sc.nextInt();
		System.out.println("Enter Department: ");
		dept=sc.nextLine();
		
		Student student= new Student(name,roll,dept);
		student.StudentInfo();
		Student student1= new Student(name,roll,dept);
		student1.StudentInfo();
		sc.close();
	}
	

}
