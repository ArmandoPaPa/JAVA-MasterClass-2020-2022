package JavaMasterClass2020;

public class Main {

    public static void main(String[] args) {

        BankAccount Tim = new BankAccount();
        Tim.setAccNumber(12345);
        Tim.setBalance(0.0);
        Tim.setName("Tim");
        Tim.setEmail("tim@tim.com");
        Tim.setPhoneNumber(12345);

        BankAccount Bob = new BankAccount(112233, 100.0, "Bob",
                "bob@bob.com", 332211);

        BankAccount Emma = new BankAccount("Emma", "emma@emma.com", 12345);

        BankAccount Jim = new BankAccount();

        System.out.println(Bob.getAccNumber());
        System.out.println(Bob.getBalance());
        System.out.println(Bob.getName());
        System.out.println(Bob.getEmail());
        System.out.println(Bob.getPhoneNumber());

        System.out.println("-----------");

        System.out.println(Jim.getAccNumber());
        System.out.println(Jim.getBalance());
        System.out.println(Jim.getName());
        System.out.println(Jim.getEmail());
        System.out.println(Jim.getPhoneNumber());

        System.out.println("-----------");
        System.out.println(Emma.getAccNumber());
        System.out.println(Emma.getBalance());
        System.out.println(Emma.getName());
        System.out.println(Emma.getEmail());
        System.out.println(Emma.getPhoneNumber());



        System.out.println("----- Testing Bank Account deposit / withdraw -----");

        Tim.depositFunds();
        Tim.withdrawMoney();

        Tim.depositFunds();
        Tim.withdrawMoney();
    }
}
