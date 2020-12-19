package JavaMasterClass2020;

public class Main {

    public static void main(String[] args) {

        ViPCustomer person1 = new ViPCustomer();
        System.out.println(person1.getName() + "  " + person1.getCreditLimit()
                + "  " + person1.getEmail());

        ViPCustomer person2 = new ViPCustomer("Bob", 25000);
        System.out.println(person2.getName() + "  " + person2.getCreditLimit()
                + "  " + person2.getEmail());

        ViPCustomer person3 = new ViPCustomer("Tim", 100, "tim@email.com");
        System.out.println(person3.getName() + "  " + person3.getCreditLimit()
                + "  " + person3.getEmail());
    }
}
