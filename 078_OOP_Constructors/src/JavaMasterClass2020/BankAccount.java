package JavaMasterClass2020;

import java.util.Scanner;

public class BankAccount {

    private long accNumber;
    private double balance;
    private String name;
    private String email;
    private long phoneNumber;

    public BankAccount() {
        this(101010, 0.0, "Default", "Default", 101010);
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accNumber, double balance, String name, String email, long phoneNumber) {
        // setAccNumber(accNumber); // do not call setters or other methods in constructors!
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("BankAccount constructor with parameters called!");
    }

    public BankAccount(String name, String email, long phoneNumber) {
        this(99999, 100.55, name, email, phoneNumber);
    }

    Scanner sc = new Scanner(System.in);

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public long getAccNumber() {
        return this.accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds() {
        System.out.println("Your current account balance = " + getBalance());
        System.out.print("Enter amount you want to deposit =    ");
        boolean hasNextDouble = sc.hasNextDouble();
        if (hasNextDouble) {
            double deposit = sc.nextDouble();
            sc.nextLine();
            if (deposit > 0) {
                this.balance += deposit;
                System.out.println("Success. Your current account balance = " + getBalance());
            } else {
                System.out.println("Operation unsuccessful");
            }
        } else {
            sc.nextLine();
            System.out.println("Operation unsuccessful");
        }
    }

    public void withdrawMoney() {
        System.out.println("Your current account balance = " + getBalance());
        System.out.print("Enter amount you want to withdraw =    ");
        boolean hasNextDouble = sc.hasNextDouble();
        if (hasNextDouble) {
            double withdraw = sc.nextDouble();
            sc.nextLine();
            if (withdraw > 0 && withdraw <= this.balance) {
                this.balance -= withdraw;
                System.out.println("Success. Your current account balance = " + getBalance());
            } else {
                System.out.println("Operation unsuccessful");
            }
        } else {
            sc.nextLine();
            System.out.println("Operation unsuccessful");
        }
    }
}

