import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.next();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        balance += amount;
        System.out.println("Deposit Successful!");
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.createAccount();
        account.deposit();
        account.withdraw();
        account.display();
    }
}