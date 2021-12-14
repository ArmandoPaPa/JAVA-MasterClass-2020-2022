package JavaMasterClass2021;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customer, double initialAmount) {
        if (findCustomer(customer) == null) {
            this.customers.add(new Customer(customer, initialAmount));
            return true;
        } else {
            return false;
        }
    }


    public boolean addCustomerTransaction(String customer, double transaction) {
        Customer existingCustomer = findCustomer(customer);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }


    private Customer findCustomer(String customer) {

        for (int i = 0; i < this.customers.size(); i++) {
            if (customers.get(i).getName().equals(customer)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

}
