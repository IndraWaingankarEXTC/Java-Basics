import java.util.Scanner;

class Employee {
	int id;
	String name;
	double salary;

	void setEmployee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

class Developer extends Employee {
	double bonus;
	double finalSalary;

	double calculateBonus(double percentage) {
		bonus = salary * percentage / 100;
		finalSalary = salary + bonus;
		return bonus;
	}

	void display() {
		super.display();
		System.out.println("Bonus: " + bonus);
		System.out.println("Final Salary: " + finalSalary);
		System.out.println("----------------------");
	}
}

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of developers: ");
		int n = sc.nextInt();
		sc.nextLine();

		Developer[] developers = new Developer[n];

		for (int i = 0; i < n; i++) {

			developers[i] = new Developer();

			System.out.println("\nEnter details of Developer " + (i + 1));

			System.out.print("Enter Employee ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Employee Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Salary: ");
			double salary = sc.nextDouble();

			System.out.print("Enter Bonus Percentage: ");
			double percentage = sc.nextDouble();

			developers[i].setEmployee(id, name, salary);
			developers[i].calculateBonus(percentage);
		}

		for (int i = 0; i < n; i++) {
			developers[i].display();
		}

		sc.close();
	}
}