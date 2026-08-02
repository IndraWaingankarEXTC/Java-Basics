import java.util.Scanner;

abstract class Student {
	int rollNo;
	String name;
	int age;

	Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	void setStudent(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	void displayStudent() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	abstract void display();
}

interface Course {
	void setCourse(String courseName, double fee);

	double calculateCourseFee(double fee);
}

interface Scholarship {
	double calculateScholarship(double fee, double percentage);
}

class UniversityStudent extends Student implements Course, Scholarship {

	String courseName;
	double courseFee;
	double scholarship;
	double finalFee;

	UniversityStudent(int rollNo, String name, int age,
	                  String courseName, double courseFee) {

		super(rollNo, name, age);
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public void setCourse(String courseName, double fee) {
		this.courseName = courseName;
		this.courseFee = fee;
	}

	public double calculateCourseFee(double fee) {
		courseFee = fee;
		return courseFee;
	}

	public double calculateScholarship(double fee, double percentage) {
		scholarship = fee * percentage / 100;
		return scholarship;
	}

	double calculateFinalFee(double fee, double scholarship) {
		finalFee = fee - scholarship;
		return finalFee;
	}

	void display() {
		displayStudent();

		System.out.println("Course Name: " + courseName);
		System.out.println("Course Fee: " + courseFee);
		System.out.println("Scholarship: " + scholarship);
		System.out.println("Final Fee: " + finalFee);
	}
}

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		sc.nextLine();

		UniversityStudent[] students =
		    new UniversityStudent[n];

		for (int i = 0; i < n; i++) {

			System.out.println("\nEnter details of Student " + (i + 1));

			System.out.print("Enter Roll No: ");
			int rollNo = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Course Name: ");
			String courseName = sc.nextLine();

			System.out.print("Enter Course Fee: ");
			double fee = sc.nextDouble();

			System.out.print("Enter Scholarship Percentage: ");
			double percentage = sc.nextDouble();

			students[i] = new UniversityStudent(
			    rollNo,
			    name,
			    age,
			    courseName,
			    fee
			);

			students[i].setCourse(courseName, fee);

			students[i].calculateCourseFee(fee);

			students[i].calculateScholarship(
			    fee,
			    percentage
			);

			students[i].calculateFinalFee(
			    fee,
			    students[i].scholarship
			);
		}

		System.out.println("\n===== UNIVERSITY STUDENT DETAILS =====");

		for (int i = 0; i < n; i++) {
			students[i].display();
		}

		sc.close();
	}
}
