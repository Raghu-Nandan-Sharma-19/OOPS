import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.00;
            System.out.println("Insufficient funds!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Incorrect amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayDetails() {
        System.out.println("Account number : " + this.accountNumber);
        System.out.printf("Balance : %.2f\n", this.balance);
    }
}

public class AttributesAndMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, balance);

        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        account.displayDetails();

        sc.close();
    }
}
