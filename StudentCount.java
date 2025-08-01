/*Author       : Ganesh Chandran
  Date         : [Date]
  Description  : [Question] */
package Test;
class Student{
	String name;
	int rollNumber;
	static int studentCount=0;
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	public static void displayStudentCount() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Total Student count:" + studentCount);
	}
	
}
public class StudentCount {
	public static void main(String[] args) {
		Student student1 = new Student("Austin",14);
		Student student2 = new Student("Bobby",26);
		Student student3 = new Student("Ganesh",36);
		Student.displayStudentCount();
	}

}
