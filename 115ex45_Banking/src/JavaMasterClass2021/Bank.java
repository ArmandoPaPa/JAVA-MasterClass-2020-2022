package JavaMasterClass2021;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }


    public boolean addBranch(String branch) {
        if (findBranch(branch) == null) {
            this.branches.add(new Branch(branch));
            return true;
        } else {
            return false;
        }
    }


    public boolean addCustomer(String branch, String customer, double initialAmount) {
        if (findBranch(branch) != null) {
            return findBranch(branch).newCustomer(customer, initialAmount);
        } else {
            return false;
        }
    }


    public boolean addCustomerTransaction(String branch, String customer, double transaction) {

        if (findBranch(branch) != null) {
            return findBranch(branch).addCustomerTransaction(customer, transaction);
        } else {
            return false;
        }
    }


    private Branch findBranch(String branch) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(branch)) {
                return this.branches.get(i);
            }
        }
        return null;
    }


    public boolean listCustomers(String branch, boolean showTransactions) {
        if (findBranch(branch) != null) {
            System.out.println("Customer details for branch " + findBranch(branch).getName());

            ArrayList<Customer> branchCustomers = findBranch(branch).getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer: "
                        + branchCustomers.get(i).getName()
                        + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount "
                                + transactions.get(j).doubleValue());
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

}