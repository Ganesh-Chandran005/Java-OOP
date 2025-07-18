/*Author       : Ganesh Chandran
  Date         : [Date]
  Description  : [Question] */
package LAB;

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
		Student student= new Student("Austin",14,"CSE");
		student.StudentInfo();
		System.out.println("\n");
		Student student1= new Student("Ganesh",36,"CSE");
		student1.StudentInfo();
		
	}

}
