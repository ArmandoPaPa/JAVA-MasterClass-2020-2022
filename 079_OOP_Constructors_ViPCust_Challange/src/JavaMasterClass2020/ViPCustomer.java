package JavaMasterClass2020;

public class ViPCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public ViPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public ViPCustomer (){
        this ("Default", 10000, "default@email.com");
    }

    public ViPCustomer(String name, double creditLimit) {
        this (name, creditLimit, "unknown");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
