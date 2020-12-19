package JavaMasterClass2020;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    Car car = new accFerrari("Ferrari", 12);
                    System.out.println(car.getName());
                    System.out.println(car.startEngine() + "\n" + car.accelerate()
                            + "\n" + car.brake());
                    break;
                case 1:
                    car = new brokenCar("brokenCar", 4);
                    System.out.println(car.getName());
                    System.out.println(car.startEngine() + "\n" + car.accelerate()
                            + "\n" + car.brake());
                    break;
                case 2:
                    car = new VW("VW", 8);
                    System.out.println(car.getName());
                    System.out.println(car.startEngine() + "\n" + car.accelerate()
                            + "\n" + car.brake());
                    break;
            }
        }
    }
}

class accFerrari extends Car {
    public accFerrari(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public String accelerate() {
        return "GO GO Ferrari";
    }

    @Override
    public String brake() {
        return "Never BRAKE ;)";
    }
}

class brokenCar extends Car {
    public brokenCar(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Cannot start Engine = Car is broken";
    }

    @Override
    public String accelerate() {
        return "Cannot accelerate = Car is broken";
    }
}

class VW extends Car {
    public VW(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public String brake() {
        return "Drive carefully, brake as needed";
    }
}


