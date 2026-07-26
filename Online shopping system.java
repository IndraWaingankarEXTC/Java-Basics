import java.util.Scanner;

class Customer {
	String name, gender;
	int age;
	long phone;

	Scanner sc = new Scanner(System.in);

	void acceptCustomer() {
		System.out.print("Enter Customer Name: ");
		name = sc.nextLine();

		System.out.print("Enter Age: ");
		age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Gender: ");
		gender = sc.nextLine();

		System.out.print("Enter Phone Number: ");
		phone = sc.nextLong();
	}

	void displayCustomer() {
		System.out.println("\nCustomer Name : " + name);
		System.out.println("Age           : " + age);
		System.out.println("Gender        : " + gender);
		System.out.println("Phone Number  : " + phone);
	}
}

class Shopping extends Customer {
	String product;
	int qty;
	double price, total, discount, gst, finalAmount;

	void acceptProduct() {
		sc.nextLine(); // Clear leftover newline

		System.out.print("\nEnter Product Name: ");
		product = sc.nextLine();

		System.out.print("Enter Quantity: ");
		qty = sc.nextInt();

		System.out.print("Enter Price: ");
		price = sc.nextDouble();
	}

	void calculateTotal() {
		total = qty * price;
	}

	void calculateDiscount() {
		if (total >= 5000)
			discount = total * 0.20;
		else if (total >= 3000)
			discount = total * 0.10;
		else
			discount = 0;
	}

	void calculateGST() {
		gst = (total - discount) * 0.18;
		finalAmount = total - discount + gst;
	}

	void generateInvoice() {
		displayCustomer();

		System.out.println("\nProduct       : " + product);
		System.out.println("Quantity      : " + qty);
		System.out.println("Price         : " + price);
		System.out.println("Total         : " + total);
		System.out.println("Discount      : " + discount);
		System.out.println("GST           : " + gst);
		System.out.println("Final Amount  : " + finalAmount);
	}
}

public class Main {
	public static void main(String[] args) {
		Shopping s = new Shopping();

		s.acceptCustomer();
		s.acceptProduct();
		s.calculateTotal();
		s.calculateDiscount();
		s.calculateGST();
		s.generateInvoice();
	}
}