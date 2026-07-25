import java.util.Scanner;

class Bank {
    int accNo;
    String name;
    double balance;

    void createAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(Scanner sc) {
        System.out.print("Enter Deposit Amount: ");
        double amt = sc.nextDouble();
        balance += amt;
    }

    void withdraw(Scanner sc) {
        System.out.print("Enter Withdrawal Amount: ");
        double amt = sc.nextDouble();

        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("\nAccount Number : " + accNo);
        System.out.println("Account Holder : " + name);
        System.out.println("Balance : " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        int choice;

        b.createAccount(sc);

        do {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    b.deposit(sc);
                    break;
                case 2:
                    b.withdraw(sc);
                    break;
                case 3:
                    b.display();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while(choice != 4);

        sc.close();
    }
}