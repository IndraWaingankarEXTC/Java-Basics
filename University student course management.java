import java.util.Scanner;

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void displayPerson() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
	}

	void changeName(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String course;
	int semester;

	Student(int id, String name, String course, int semester) {
		super(id, name);
		this.course = course;
		this.semester = semester;
	}

	void setCourse(String course, int semester) {
		this.course = course;
		this.semester = semester;
	}

	void displayStudent() {
		displayPerson();
		System.out.println("Course: " + course);
		System.out.println("Semester: " + semester);
	}
}

class UniversityStudent extends Student {
	double courseFee;
	double scholarship;
	double finalFee;

	UniversityStudent(int id, String name, String course,
	                  int semester, double courseFee) {
		super(id, name, course, semester);
		this.courseFee = courseFee;
	}

	double calculateScholarship(double percentage) {
		scholarship = courseFee * percentage / 100;
		return scholarship;
	}

	double calculateFinalFee(double fee, double scholarship) {
		finalFee = fee - scholarship;
		return finalFee;
	}

	void display() {
		displayStudent();
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

			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Course: ");
			String course = sc.nextLine();

			System.out.print("Enter Semester: ");
			int semester = sc.nextInt();

			System.out.print("Enter Course Fee: ");
			double fee = sc.nextDouble();

			System.out.print("Enter Scholarship Percentage: ");
			double percentage = sc.nextDouble();

			students[i] = new UniversityStudent(
			    id, name, course, semester, fee
			);

			students[i].calculateScholarship(percentage);
			students[i].calculateFinalFee(
			    students[i].courseFee,
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