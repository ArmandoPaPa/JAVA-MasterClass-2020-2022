package JavaMasterClass2020;

public class BurgerComponents {
    final private String name;
    final private double pricePerUnit;

    public BurgerComponents(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

}